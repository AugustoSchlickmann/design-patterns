package abstractfactory.entidades;

import abstractfactory.EnumTipoAnexo;

public class Anexo {
    
    private Long id;

    private String descricao;

    private Peca peca;

    private FormularioPdf formularioPdf;

    private FormularioHtml formularioHtml;

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

    public Anexo(Long id, String descricao, FormularioPdf formularioPdf) {
        this.id = id;
        this.descricao = descricao;
        this.formularioPdf = formularioPdf;
        this.tipoAnexo = EnumTipoAnexo.FORMULARIO;
    }

    public Anexo(Long id, String descricao, FormularioHtml formularioHtml) {
        this.id = id;
        this.descricao = descricao;
        this.formularioHtml = formularioHtml;
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

    public FormularioPdf getFormularioPdf() {
        return formularioPdf;
    }

    public FormularioHtml getFormularioHtml() {
        return formularioHtml;
    }

    public Upload getUpload() {
        return upload;
    }

    public EnumTipoAnexo getTipoAnexo() {
        return tipoAnexo;
    }
    
}
