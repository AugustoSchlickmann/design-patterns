package abstractfactory;

import abstractfactory.formulariofactory.FormularioFactory;
import abstractfactory.pecafactory.PecaFactory;
import abstractfactory.uploadfactory.UploadFactory;

public class ExecuteAbstractFactory {
    
    public static void main(String[] args) {
        PecaFactory pecaFactory = new PecaFactory();
        pecaFactory.getValidador().validar();
        pecaFactory.getCriador().criar();
        pecaFactory.getNomeador().nomear();
        System.out.println("-------------------------------------------------");

        UploadFactory uploadFactory = new UploadFactory();
        uploadFactory.getValidador().validar();
        uploadFactory.getCriador().criar();
        uploadFactory.getNomeador().nomear();
        System.out.println("-------------------------------------------------");

        FormularioFactory formularioFactory = new FormularioFactory();
        formularioFactory.getValidador().validar();
        formularioFactory.getCriador().criar();
        formularioFactory.getNomeador().nomear();
    }
}