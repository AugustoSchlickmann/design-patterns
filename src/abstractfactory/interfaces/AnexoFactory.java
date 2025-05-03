package abstractfactory.interfaces;

import abstractfactory.entidades.Anexo;

public interface AnexoFactory<T extends Anexo> {

    CriadorAnexo<T> getCriador();

    ValidadorAnexo<T> getValidador();
    
    NomeadorAnexo<T> getNomeador();
} 
