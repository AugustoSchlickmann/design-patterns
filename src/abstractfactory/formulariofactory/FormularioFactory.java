package abstractfactory.formulariofactory;

import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class FormularioFactory implements AnexoFactory {

    @Override
    public CriadorAnexo getCriador() {
        return new CriadorFormulario();
    }

    @Override
    public NomeadorAnexo getNomeador() {
        return new NomeadorFormulario();
    }

    @Override
    public ValidadorAnexo getValidador() {
        return new ValidadorFormulario();
    }
    
}
