package abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import abstractfactory.entidades.Anexo;
import abstractfactory.entidades.Formulario;
import abstractfactory.entidades.Imprimivel;
import abstractfactory.entidades.Peca;
import abstractfactory.entidades.Upload;
import abstractfactory.impl.formulariofactory.FormularioFactory;
import abstractfactory.impl.pecafactory.PecaFactory;
import abstractfactory.impl.uploadfactory.UploadFactory;
import abstractfactory.interfaces.AnexoFactory;

public class ExecuteAbstractFactory {
    
    private static final Map<Class<? extends Imprimivel>, Function<Anexo, ? extends Imprimivel>> relationshipMap = new HashMap<>();

    static {
        // Mapeia cada tipo relacionado ao Anexo
        relationshipMap.put(Peca.class, Anexo::getPeca);
        relationshipMap.put(Formulario.class, Anexo::getFormulario);
        relationshipMap.put(Upload.class, Anexo::getUpload);
    }

    public static void main(String[] args) {
        // Registra as factories no início da aplicação
        FactoryRegistry.getInstance().registerFactory(Peca.class, new PecaFactory());
        FactoryRegistry.getInstance().registerFactory(Formulario.class, new FormularioFactory());
        FactoryRegistry.getInstance().registerFactory(Upload.class, new UploadFactory());

        // Gera um número aleatório entre 1 e 3
        int numero = new Random().nextInt(3) + 1; 
        System.out.println("Número gerado: " + numero);
        Anexo anexo = getAnexo(numero);

        // Descobre dinamicamente o tipo relacionado ao Anexo
        relationshipMap.forEach((type, extractor) -> {
            Imprimivel imprimivel = extractor.apply(anexo);
            if (imprimivel != null) {
                System.out.println("Anexo relacionado a: " + type.getSimpleName());
                @SuppressWarnings("unchecked")
                AnexoFactory<Imprimivel> factory = (AnexoFactory<Imprimivel>) FactoryRegistry.getInstance().getFactory(imprimivel.getClass());
                factory.getValidador().validar(imprimivel);
                factory.getCriador().criar(imprimivel);
                factory.getNomeador().nomear(imprimivel);
            }
        });
    }

    public static Anexo getAnexo(int numero) {
        switch (numero) {
            case 1:
                Peca peca = new Peca(1l, "Peça 1");
                return new Anexo(2l, "Anexo de Peça", peca);
            case 2:
                Formulario formulario = new Formulario(1l, "Formulário 1");
                return new Anexo(3l, "Anexo de Formulário", formulario);
            default:
                Upload upload = new Upload(1l, "Upload 1");
                return new Anexo(4l, "Anexo de Upload", upload);
        }
    }
}