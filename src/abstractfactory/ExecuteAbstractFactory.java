package abstractfactory;

import java.util.Random;

import abstractfactory.entidades.Anexo;
import abstractfactory.entidades.Formulario;
import abstractfactory.entidades.Peca;
import abstractfactory.entidades.Upload;
import abstractfactory.impl.formulariofactory.FormularioFactory;
import abstractfactory.impl.pecafactory.PecaFactory;
import abstractfactory.impl.uploadfactory.UploadFactory;
import abstractfactory.interfaces.AnexoFactory;

public class ExecuteAbstractFactory {
    
    public static void main(String[] args) {
        // Registra as factories no início da aplicação
        FactoryRegistry.getInstance().registerFactory(Peca.class, new PecaFactory());
        FactoryRegistry.getInstance().registerFactory(Formulario.class, new FormularioFactory());
        FactoryRegistry.getInstance().registerFactory(Upload.class, new UploadFactory());

        // Gera um número aleatório entre 1 e 3
        int numero = new Random().nextInt(3) + 1; 
        System.out.println("Número gerado: " + numero);
        Anexo anexo = getAnexo(numero);

        // Obtém a factory correspondente com base no tipo do anexo
        @SuppressWarnings("unchecked")
        AnexoFactory<Anexo> factory = (AnexoFactory<Anexo>) FactoryRegistry.getInstance().getFactory(anexo.getClass());

        // Usa a factory para criar, validar e nomear o anexo
        factory.getValidador().validar(anexo);
        factory.getCriador().criar(anexo);
        factory.getNomeador().nomear(anexo);
    }

    public static Anexo getAnexo(int numero) {
        switch (numero) {
            case 1:
                return new Peca(1l, "Peça 1");
            case 2:
                return new Formulario(1l, "Formulário 1");
            default:
                return new Upload(1l, "Upload 1");
        }
    }
}