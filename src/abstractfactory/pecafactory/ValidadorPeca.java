package abstractfactory.pecafactory;

import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorPeca implements ValidadorAnexo {

    @Override
    public void validar() {
        System.out.println("Validando peça...");
    }

}
