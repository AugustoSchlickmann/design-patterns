package abstractfactory.impl.formulariofactory;

import abstractfactory.entidades.Formulario;
import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class FormularioFactory implements AnexoFactory<Formulario>{

    private CriadorAnexo<Formulario> criador;
    private NomeadorAnexo<Formulario> nomeador;
    private ValidadorAnexo<Formulario> validador;

    public FormularioFactory() {
        this.criador = new CriadorFormulario();
        this.nomeador = new NomeadorFormulario();
        this.validador = new ValidadorFormulario();
    }

    @Override
    public CriadorAnexo<Formulario> getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo<Formulario> getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo<Formulario> getValidador() {
        return this.validador;
    }
    
}
