package abstractfactory.entidades;

public class Upload implements Imprimivel {
    
    private Long id;

    private String nome;

    public Upload(Long id, String nome) {
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
        return "Upload: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
