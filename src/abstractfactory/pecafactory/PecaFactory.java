package abstractfactory.pecafactory;

import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class PecaFactory implements AnexoFactory {

    private CriadorAnexo criador;
    private NomeadorAnexo nomeador;
    private ValidadorAnexo validador;

    public PecaFactory() {
        this.criador = new CriadorPeca();
        this.nomeador = new NomeadorPeca();
        this.validador = new ValidadorPeca();
    }

    @Override
    public CriadorAnexo getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo getValidador() {
        return this.validador;
    }
    
}
