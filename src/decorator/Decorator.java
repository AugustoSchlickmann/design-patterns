package decorator;

public abstract class Decorator implements Auditoria {

    protected Auditoria auditoria;

    public Decorator(Auditoria auditoria){
        this.auditoria = auditoria;
    }

}
