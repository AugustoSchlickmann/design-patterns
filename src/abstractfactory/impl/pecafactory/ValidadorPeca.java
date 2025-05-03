package abstractfactory.impl.pecafactory;

import abstractfactory.entidades.Peca;
import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorPeca implements ValidadorAnexo<Peca> {

    @Override
    public void validar(Peca peca) {
        System.out.println("Validando " + peca.getNome() + "...");
    }

}
