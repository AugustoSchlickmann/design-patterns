package abstractfactory.interfaces;

public interface AnexoFactory {

    CriadorAnexo getCriador();

    ValidadorAnexo getValidador();
    
    NomeadorAnexo getNomeador();
} 
