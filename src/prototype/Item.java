package prototype;

import java.math.BigDecimal;

public class Item implements HistoricoPrototype<Item> {

    private String nome;

    private BigDecimal preco;

    private int quantidade;

    public Item(String nome, BigDecimal preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Item(Item item) {
        this.nome = item.nome;
        this.preco = item.preco;
        this.quantidade = item.quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public Item clone() {
        return new Item(this);
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;
        if (outro == null || getClass() != outro.getClass()) return false;

        Item item = (Item) outro;
        return nome.equals(item.nome) && preco.equals(item.preco);
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}
