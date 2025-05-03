package decorator;

public class DecoratorImpl extends Decorator {

    public DecoratorImpl(Auditoria auditoria) {
        super(auditoria);
    }

    @Override
    public Elemento create() {
       Elemento elemento = this.auditoria.create();
       System.out.println("Auditando a criação de " + elemento.toString() + "...");
       return elemento;
    }

    @Override
    public void read(Elemento elemento) {
        this.auditoria.read(elemento);
        System.out.println("Auditando a leitura de " + elemento.toString() + "...");
    }

    @Override
    public void update(Elemento elemento) {
        this.auditoria.update(elemento);
        System.out.println("Auditando a atualização de " + elemento.toString() + "...");
    }

    @Override
    public void delete(Elemento elemento) {
        this.auditoria.delete(elemento);
        System.out.println("Auditando a exclusão de " + elemento.toString() + "...");
    }

}
