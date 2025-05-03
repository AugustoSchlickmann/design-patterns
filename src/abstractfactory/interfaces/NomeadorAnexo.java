package abstractfactory.interfaces;

import abstractfactory.entidades.Anexo;

public interface NomeadorAnexo<T extends Anexo> {
    
    public void nomear(T anexo);
}
