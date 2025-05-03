package abstractfactory.entidades;

public class Upload extends Anexo {
    
    private Long id;

    private String nome;

    public Upload(Long id, String nome) {
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
        return "Upload: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
