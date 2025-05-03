package abstractfactory.entidades;

public class Anexo {
    
    private Long id;

    private String descricao;

    private Peca peca;

    private Formulario formulario;

    private Upload upload;

    public Anexo(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Anexo(Long id, String descricao, Peca peca) {
        this.id = id;
        this.descricao = descricao;
        this.peca = peca;
    }

    public Anexo(Long id, String descricao, Formulario formulario) {
        this.id = id;
        this.descricao = descricao;
        this.formulario = formulario;
    }

    public Anexo(Long id, String descricao, Upload upload) {
        this.id = id;
        this.descricao = descricao;
        this.upload = upload;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return "Anexo: " + descricao;
    }

    public void setDescricao(String nome) {
        this.descricao = nome;
    }

    public Peca getPeca() {
        return peca;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public Upload getUpload() {
        return upload;
    }
    
}
