package decorator;

public class AuditoriaDecorator extends Decorator {

    public AuditoriaDecorator(Acao acao) {
        super(acao);
    }

    @Override
    public Elemento create() {
       Elemento elemento = this.acao.create();
       System.out.println("Auditando a criação do " + elemento.toString() + "...");
       return elemento;
    }

    @Override
    public void read(Elemento elemento) {
        this.acao.read(elemento);
        System.out.println("Auditando a leitura do " + elemento.toString() + "...");
    }

    @Override
    public void update(Elemento elemento) {
        this.acao.update(elemento);
        System.out.println("Auditando a atualização do " + elemento.toString() + "...");
    }

    @Override
    public void delete(Elemento elemento) {
        this.acao.delete(elemento);
        System.out.println("Auditando a exclusão do " + elemento.toString() + "...");
    }

}
