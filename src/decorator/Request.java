package decorator;

public class Request implements Auditoria {

    @Override
    public Elemento create() {
       System.out.println("Criando...");
       return new Elemento(99l, "Água");
    }

    @Override
    public void read(Elemento elemento) {
        System.out.println("Lendo...");
    }

    @Override
    public void update(Elemento elemento) {
        System.out.println("Atualizando...");
    }

    @Override
    public void delete(Elemento elemento) {
        System.out.println("Deletando...");
    }

}
