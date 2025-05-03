package abstractfactory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import abstractfactory.entidades.Anexo;
import abstractfactory.entidades.FormularioHtml;
import abstractfactory.entidades.FormularioPdf;
import abstractfactory.entidades.Imprimivel;
import abstractfactory.entidades.Peca;
import abstractfactory.entidades.Upload;
import abstractfactory.impl.formularioHtmlFactory.FormularioHtmlFactory;
import abstractfactory.impl.formularioPdfFactory.FormularioPdfFactory;
import abstractfactory.impl.pecafactory.PecaFactory;
import abstractfactory.impl.uploadfactory.UploadFactory;
import abstractfactory.interfaces.AnexoFactory;

public class ExecuteAbstractFactory {
    
    private static final Map<Class<? extends Imprimivel>, Function<Anexo, ? extends Imprimivel>> imprimivelMap = new LinkedHashMap<>();

    static {
        System.out.println("Populando o Map de imprimível");
        imprimivelMap.put(Peca.class, Anexo::getPeca);
        imprimivelMap.put(FormularioPdf.class, Anexo::getFormularioPdf);
        imprimivelMap.put(FormularioHtml.class, Anexo::getFormularioHtml);
        imprimivelMap.put(Upload.class, Anexo::getUpload);
    }

    public static void main(String[] args) {
        // Registra as factories no início da aplicação
        FactoryRegistry.getInstance().registerFactory(Peca.class, new PecaFactory());
        FactoryRegistry.getInstance().registerFactory(FormularioHtml.class, new FormularioHtmlFactory());
        FactoryRegistry.getInstance().registerFactory(FormularioPdf.class, new FormularioPdfFactory());
        FactoryRegistry.getInstance().registerFactory(Upload.class, new UploadFactory());

        // Gera um número aleatório entre 1 e 3
        int numero = new Random().nextInt(4) + 1; 
        System.out.println("Número gerado: " + numero);
        Anexo anexo = criaAnexo(numero);

        // Obtém o primeiro imprimível não nulo
        Imprimivel imprimivel = findFirstImprimivelNonNull(anexo);
        System.out.println("Anexo relacionado a: " + imprimivel.getClass().getSimpleName());

        @SuppressWarnings("unchecked")
        AnexoFactory<Imprimivel> factory = (AnexoFactory<Imprimivel>) FactoryRegistry.getInstance().getFactory(imprimivel.getClass());
        factory.getValidador().validar(imprimivel);
        factory.getCriador().criar(imprimivel);
        factory.getNomeador().nomear(imprimivel);
    }

    private static Imprimivel findFirstImprimivelNonNull(Anexo anexo) {
        for (Map.Entry<Class<? extends Imprimivel>, Function<Anexo, ? extends Imprimivel>> entry : imprimivelMap.entrySet()) {
            System.out.println("Verificando o mapa de imprimível para -> " + entry.getKey());
            
            Imprimivel imprimivel = entry.getValue().apply(anexo);
            if (imprimivel != null) {
                return imprimivel;
            }
        }

        throw new IllegalArgumentException("Nenhum imprimível relacionado ao Anexo encontrado.");
    }

    public static Anexo criaAnexo(int numero) {
        switch (numero) {
            case 1:
                Peca peca = new Peca(1l, "Peça 1");
                return new Anexo(2l, "Anexo de Peça", peca);
            case 2:
                FormularioPdf formularioPdf = new FormularioPdf(2l, "Formulário 2");
                return new Anexo(3l, "Anexo de Formulário", formularioPdf);
            case 3:
                FormularioHtml formularioHtml = new FormularioHtml(3l, "Formulário 3");
                return new Anexo(3l, "Anexo de Formulário", formularioHtml);
            default:
                Upload upload = new Upload(4l, "Upload 4");
                return new Anexo(4l, "Anexo de Upload", upload);
        }
    }
}