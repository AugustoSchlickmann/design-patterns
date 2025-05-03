package abstractfactory.impl.formularioHtmlFactory;

import abstractfactory.entidades.FormularioHtml;
import abstractfactory.interfaces.CriadorAnexo;

public class CriadorFormularioHtml implements CriadorAnexo<FormularioHtml> {

    @Override
    public void criar(FormularioHtml formulario) {
        System.out.println("Criando formulário HTML...");
    }
    

    
}
