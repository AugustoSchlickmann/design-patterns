package abstractfactory;

import java.util.Random;

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
    
    public static void main(String[] args) {
        // Registra as factories no início da aplicação
        FactoryRegistry.getInstance().registerFactory(Peca.class, new PecaFactory());
        FactoryRegistry.getInstance().registerFactory(Formulario.class, new FormularioFactory());
        FactoryRegistry.getInstance().registerFactory(Upload.class, new UploadFactory());

        // Gera um número aleatório entre 1 e 3
        int numero = new Random().nextInt(3) + 1; 
        System.out.println("Número gerado: " + numero);
        Anexo anexo = getAnexo(numero);

        if (anexo.getPeca() != null) {
            System.out.println("Anexo é uma peça.");
            @SuppressWarnings("unchecked")
            AnexoFactory<Imprimivel> factory = (AnexoFactory<Imprimivel>) FactoryRegistry.getInstance().getFactory(anexo.getPeca().getClass());
            factory.getValidador().validar(anexo.getPeca());
            factory.getCriador().criar(anexo.getPeca());
            factory.getNomeador().nomear(anexo.getPeca());

        } else if (anexo.getFormulario() != null) {
            System.out.println("Anexo é um formulário.");
            @SuppressWarnings("unchecked")
            AnexoFactory<Imprimivel> factory = (AnexoFactory<Imprimivel>) FactoryRegistry.getInstance().getFactory(anexo.getFormulario().getClass());
            factory.getValidador().validar(anexo.getFormulario());
            factory.getCriador().criar(anexo.getFormulario());
            factory.getNomeador().nomear(anexo.getFormulario());

        } else {
            System.out.println("Anexo é um upload.");
            @SuppressWarnings("unchecked")
            AnexoFactory<Imprimivel> factory = (AnexoFactory<Imprimivel>) FactoryRegistry.getInstance().getFactory(anexo.getUpload().getClass());
            factory.getValidador().validar(anexo.getUpload());
            factory.getCriador().criar(anexo.getUpload());
            factory.getNomeador().nomear(anexo.getUpload());
        }

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