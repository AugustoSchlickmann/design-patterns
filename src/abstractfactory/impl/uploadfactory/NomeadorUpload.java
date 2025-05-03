package abstractfactory.impl.uploadfactory;

import abstractfactory.entidades.Upload;
import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorUpload implements NomeadorAnexo<Upload> {

    @Override
    public void nomear(Upload upload) {
        System.out.println("Nomeando " + upload.getNome() + "...");
    }
    
}
