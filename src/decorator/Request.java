package decorator;

public class Request implements Acao {

    @Override
    public Elemento create() {
       System.out.println("Criando o Elemento...");
       return new Elemento(99l, "Água");
    }

    @Override
    public void read(Elemento elemento) {
        System.out.println("Lendo o " + elemento.toString() + "...");
    }

    @Override
    public void update(Elemento elemento) {
        System.out.println("Atualizando o " + elemento.toString() + "...");
    }

    @Override
    public void delete(Elemento elemento) {
        System.out.println("Deletando o " + elemento.toString() + "...");
    }

}
