package abstractfactory.impl.uploadfactory;

import abstractfactory.entidades.Upload;
import abstractfactory.interfaces.CriadorAnexo;

public class CriadorUpload implements CriadorAnexo<Upload> {

    @Override
    public void criar(Upload upload) {
        System.out.println("Criando " + upload.getNome() + "...");
    }
    

    
}
