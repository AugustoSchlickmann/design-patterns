package abstractfactory.impl.formularioPdfFactory;

import abstractfactory.entidades.FormularioPdf;
import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class FormularioPdfFactory implements AnexoFactory<FormularioPdf>{

    private CriadorAnexo<FormularioPdf> criador;
    private NomeadorAnexo<FormularioPdf> nomeador;
    private ValidadorAnexo<FormularioPdf> validador;

    public FormularioPdfFactory() {
        this.criador = new CriadorFormularioPdf();
        this.nomeador = new NomeadorFormularioPdf();
        this.validador = new ValidadorFormularioPdf();
    }

    @Override
    public CriadorAnexo<FormularioPdf> getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo<FormularioPdf> getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo<FormularioPdf> getValidador() {
        return this.validador;
    }
    
}
