package abstractfactory.impl.formularioHtmlFactory;

import abstractfactory.entidades.FormularioHtml;
import abstractfactory.interfaces.ValidadorAnexo;

public class ValidadorFormularioHtml implements ValidadorAnexo<FormularioHtml> {

    @Override
    public void validar(FormularioHtml formulario) {
        System.out.println("Validando" + formulario.getNome() + "...");
    }

}
