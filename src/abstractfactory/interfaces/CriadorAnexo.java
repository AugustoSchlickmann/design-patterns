package abstractfactory.interfaces;

import abstractfactory.entidades.Anexo;

public interface CriadorAnexo<T extends Anexo> {
    
    public void criar(T anexo);
}
