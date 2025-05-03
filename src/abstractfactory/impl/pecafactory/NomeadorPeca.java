package abstractfactory.impl.pecafactory;

import abstractfactory.entidades.Peca;
import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorPeca implements NomeadorAnexo<Peca>  {

    @Override
    public void nomear(Peca peca) {
        System.out.println("Nomeando " + peca.getNome() + "...");
    }
    
}
