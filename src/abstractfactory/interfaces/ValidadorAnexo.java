package abstractfactory.interfaces;

import abstractfactory.entidades.Anexo;

public interface ValidadorAnexo<T extends Anexo> {
    
    public void validar(T anexo);
}
