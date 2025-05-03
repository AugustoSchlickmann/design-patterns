package decorator;

public class FilaDecorator extends Decorator {

    public FilaDecorator(Acao auditoria) {
        super(auditoria);
    }

    @Override
    public Elemento create() {
       Elemento elemento = this.auditoria.create();
       System.out.println("Colocando o " + elemento.toString() + " na fila...");
       return elemento;
    }

    @Override
    public void read(Elemento elemento) {
        this.auditoria.read(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

    @Override
    public void update(Elemento elemento) {
        this.auditoria.update(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

    @Override
    public void delete(Elemento elemento) {
        this.auditoria.delete(elemento);
        System.out.println("Colocando o " + elemento.toString() + " na fila...");
    }

}
