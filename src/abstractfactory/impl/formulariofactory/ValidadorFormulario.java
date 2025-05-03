package abstractfactory.impl.formulariofactory;

import abstractfactory.entidades.Formulario;
import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorFormulario implements ValidadorAnexo<Formulario> {

    @Override
    public void validar(Formulario formulario) {
        System.out.println("Validando" + formulario.getNome() + "...");
    }

}
