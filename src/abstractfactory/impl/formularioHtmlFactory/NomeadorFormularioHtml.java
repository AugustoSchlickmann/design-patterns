package abstractfactory.impl.formularioHtmlFactory;

import abstractfactory.entidades.FormularioHtml;
import abstractfactory.interfaces.NomeadorAnexo;

public class NomeadorFormularioHtml implements NomeadorAnexo<FormularioHtml> {

    @Override
    public void nomear(FormularioHtml formulario) {
        System.out.println("Nomeando formulário HTML...");
    }
    
}
