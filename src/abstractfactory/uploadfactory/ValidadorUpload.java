package abstractfactory.uploadfactory;

import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorUpload implements ValidadorAnexo {

    @Override
    public void validar() {
        System.out.println("Validando upload...");
    }

}
