package decorator;

public abstract class Decorator implements Acao {

    protected Acao acao;

    public Decorator(Acao acao){
        this.acao = acao;
    }

}
