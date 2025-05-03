package decorator;

public class AuditoriaDecorator extends Decorator {

    public AuditoriaDecorator(Acao auditoria) {
        super(auditoria);
    }

    @Override
    public Elemento create() {
       Elemento elemento = this.auditoria.create();
       System.out.println("Auditando a criação do " + elemento.toString() + "...");
       return elemento;
    }

    @Override
    public void read(Elemento elemento) {
        this.auditoria.read(elemento);
        System.out.println("Auditando a leitura do " + elemento.toString() + "...");
    }

    @Override
    public void update(Elemento elemento) {
        this.auditoria.update(elemento);
        System.out.println("Auditando a atualização do " + elemento.toString() + "...");
    }

    @Override
    public void delete(Elemento elemento) {
        this.auditoria.delete(elemento);
        System.out.println("Auditando a exclusão do " + elemento.toString() + "...");
    }

}
