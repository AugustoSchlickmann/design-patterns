package abstractfactory.uploadfactory;

import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorUpload implements NomeadorAnexo {

    @Override
    public void nomear() {
        System.out.println("Nomeando upload...");
    }
    
}
