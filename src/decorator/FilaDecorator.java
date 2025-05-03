package decorator;

public class FilaDecorator extends Decorator {

    public FilaDecorator(Acao acao) {
        super(acao);
    }

    @Override
    public Elemento create() {
       Elemento elemento = this.acao.create();
       System.out.println("Colocando o " + elemento.toString() + " na fila...");
       return elemento;
    }

    @Override
    public void read(Elemento elemento) {
        this.acao.read(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

    @Override
    public void update(Elemento elemento) {
        this.acao.update(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

    @Override
    public void delete(Elemento elemento) {
        this.acao.delete(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

}
