package abstractfactory.pecafactory;

import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorPeca implements NomeadorAnexo {

    @Override
    public void nomear() {
        System.out.println("Nomeando peça...");
    }
    
}
