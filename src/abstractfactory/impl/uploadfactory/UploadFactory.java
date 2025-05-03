package abstractfactory.impl.uploadfactory;

import abstractfactory.entidades.Upload;
import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class UploadFactory implements AnexoFactory<Upload> {
   
    private CriadorAnexo<Upload> criador;
    private NomeadorAnexo<Upload> nomeador;
    private ValidadorAnexo<Upload> validador;

    public UploadFactory() {
        this.criador = new CriadorUpload();
        this.nomeador = new NomeadorUpload();
        this.validador = new ValidadorUpload();
    }
    
    @Override
    public CriadorAnexo<Upload> getCriador() {
        return this.criador;
    }

    @Override
    public NomeadorAnexo<Upload> getNomeador() {
        return this.nomeador;
    }

    @Override
    public ValidadorAnexo<Upload> getValidador() {
        return this.validador;
    }
    
}
