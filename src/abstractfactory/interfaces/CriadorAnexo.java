package abstractfactory.interfaces;

import abstractfactory.entidades.Imprimivel;

public interface CriadorAnexo<T extends Imprimivel> {
    
    public void criar(T anexo);
}
