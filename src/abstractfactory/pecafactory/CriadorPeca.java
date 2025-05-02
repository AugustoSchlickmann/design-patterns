package abstractfactory.pecafactory;

import abstractfactory.interfaces.CriadorAnexo;

public class CriadorPeca implements CriadorAnexo {

    @Override
    public void criar() {
        System.out.println("Criando peça...");
    }
    

    
}
