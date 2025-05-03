package abstractfactory.interfaces;

import abstractfactory.entidades.Imprimivel;

public interface AnexoFactory<T extends Imprimivel> {

    CriadorAnexo<T> getCriador();

    ValidadorAnexo<T> getValidador();
    
    NomeadorAnexo<T> getNomeador();
} 
