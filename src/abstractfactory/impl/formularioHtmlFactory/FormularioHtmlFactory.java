package abstractfactory.impl.formularioHtmlFactory;

import abstractfactory.entidades.FormularioHtml;
import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class FormularioHtmlFactory implements AnexoFactory<FormularioHtml>{

    private CriadorAnexo<FormularioHtml> criador;
    private NomeadorAnexo<FormularioHtml> nomeador;
    private ValidadorAnexo<FormularioHtml> validador;

    public FormularioHtmlFactory() {
        this.criador = new CriadorFormularioHtml();
        this.nomeador = new NomeadorFormularioHtml();
        this.validador = new ValidadorFormularioHtml();
    }

    @Override
    public CriadorAnexo<FormularioHtml> getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo<FormularioHtml> getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo<FormularioHtml> getValidador() {
        return this.validador;
    }
    
}
