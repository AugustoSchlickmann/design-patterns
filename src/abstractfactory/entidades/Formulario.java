package abstractfactory.entidades;

public class Formulario implements Imprimivel {
    
    private Long id;

    private String nome;

    public Formulario(Long id, String nome) {
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
        return "Formulário: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
