package abstractfactory.impl.pecafactory;

import abstractfactory.entidades.Peca;
import abstractfactory.interfaces.CriadorAnexo;

public class CriadorPeca implements CriadorAnexo<Peca> {

    @Override
    public void criar(Peca peca) {
        System.out.println("Criando " + peca.getNome() + "...");
    }
    

    
}
