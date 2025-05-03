package abstractfactory.interfaces;

import abstractfactory.entidades.Imprimivel;

public interface ValidadorAnexo<T extends Imprimivel> {
    
    public void validar(T anexo);
}
