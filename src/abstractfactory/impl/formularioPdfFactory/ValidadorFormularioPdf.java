package abstractfactory.impl.formularioPdfFactory;

import abstractfactory.entidades.FormularioPdf;
import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorFormularioPdf implements ValidadorAnexo<FormularioPdf> {

    @Override
    public void validar(FormularioPdf formulario) {
        System.out.println("Validando" + formulario.getNome() + "...");
    }

}
