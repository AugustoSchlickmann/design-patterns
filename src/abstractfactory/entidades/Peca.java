package abstractfactory.entidades;

public class Peca extends Anexo {
    
    private Long id;

    private String nome;

    public Peca(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return "Peça: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
