package abstractfactory.entidades;

import abstractfactory.EnumTipoAnexo;

public class Anexo {
    
    private Long id;

    private String descricao;

    private Peca peca;

    private Formulario formulario;

    private Upload upload;

    private EnumTipoAnexo tipoAnexo;

    public Anexo(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Anexo(Long id, String descricao, Peca peca) {
        this.id = id;
        this.descricao = descricao;
        this.peca = peca;
        this.tipoAnexo = EnumTipoAnexo.PECA;
    }

    public Anexo(Long id, String descricao, Formulario formulario) {
        this.id = id;
        this.descricao = descricao;
        this.formulario = formulario;
        this.tipoAnexo = EnumTipoAnexo.FORMULARIO;
    }

    public Anexo(Long id, String descricao, Upload upload) {
        this.id = id;
        this.descricao = descricao;
        this.upload = upload;
        this.tipoAnexo = EnumTipoAnexo.UPLOAD;
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

    public EnumTipoAnexo getTipoAnexo() {
        return tipoAnexo;
    }

    public Imprimivel getRelacionado() {
        switch (this.getTipoAnexo()) {
            case PECA:
                return this.peca;

            case FORMULARIO:
                return this.formulario;

            case UPLOAD:
                return this.upload;
            
            default:
                throw new IllegalStateException("Tipo de anexo desconhecido: " + this.tipoAnexo);
        }
    }
    
}
