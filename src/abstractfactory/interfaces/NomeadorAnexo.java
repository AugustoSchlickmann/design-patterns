package abstractfactory.interfaces;

import abstractfactory.entidades.Imprimivel;

public interface NomeadorAnexo<T extends Imprimivel> {
    
    public void nomear(T anexo);
}
