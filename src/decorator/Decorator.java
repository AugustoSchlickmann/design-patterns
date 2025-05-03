package decorator;

public abstract class Decorator implements Acao {

    protected Acao auditoria;

    public Decorator(Acao auditoria){
        this.auditoria = auditoria;
    }

}
