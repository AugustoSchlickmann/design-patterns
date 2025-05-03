package abstractfactory.entidades;

public class Peca implements Imprimivel {
    
    private Long id;

    private String nome;

    public Peca(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return "Peça: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
