package abstractfactory.uploadfactory;

import abstractfactory.interfaces.CriadorAnexo;

public class CriadorUpload implements CriadorAnexo {

    @Override
    public void criar() {
        System.out.println("Criando upload...");
    }
    

    
}
