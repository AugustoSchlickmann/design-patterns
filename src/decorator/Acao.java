package decorator;

public interface Acao {

    public Elemento create();

    public void read(Elemento elemento);

    public void update(Elemento elemento);

    public void delete(Elemento elemento);
}
