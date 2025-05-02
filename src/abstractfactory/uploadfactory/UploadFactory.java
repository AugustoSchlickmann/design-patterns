package abstractfactory.uploadfactory;

import abstractfactory.interfaces.AnexoFactory;
import abstractfactory.interfaces.CriadorAnexo;
import abstractfactory.interfaces.NomeadorAnexo;
import abstractfactory.interfaces.ValidadorAnexo;

public class UploadFactory implements AnexoFactory {

    @Override
    public CriadorAnexo getCriador() {
        return new CriadorUpload();
    }

    @Override
    public NomeadorAnexo getNomeador() {
        return new NomeadorUpload();
    }

    @Override
    public ValidadorAnexo getValidador() {
        return new ValidadorUpload();
    }
    
}
