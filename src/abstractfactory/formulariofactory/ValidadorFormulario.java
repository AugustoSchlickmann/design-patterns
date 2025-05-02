package abstractfactory.formulariofactory;

import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorFormulario implements ValidadorAnexo {

    @Override
    public void validar() {
        System.out.println("Validando formulário...");
    }

}
