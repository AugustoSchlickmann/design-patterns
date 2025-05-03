package abstractfactory.impl.pecafactory;

import abstractfactory.entidades.Peca;
import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class PecaFactory implements AnexoFactory<Peca> {

    private CriadorAnexo<Peca> criador;
    private NomeadorAnexo<Peca> nomeador;
    private ValidadorAnexo<Peca> validador;

    public PecaFactory() {
        this.criador = new CriadorPeca();
        this.nomeador = new NomeadorPeca();
        this.validador = new ValidadorPeca();
    }

    @Override
    public CriadorAnexo<Peca> getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo<Peca> getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo<Peca> getValidador() {
        return this.validador;
    }
    
}
