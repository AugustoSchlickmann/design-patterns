package abstractfactory.entidades;

import abstractfactory.EnumTipoFormulario;

public abstract class Formulario implements Imprimivel {
    
    public abstract EnumTipoFormulario getTipoFormulario();

    public abstract String getNome();
        
}
