package abstractfactory.entidades;

import abstractfactory.EnumTipoFormulario;

public class FormularioPdf implements Imprimivel {
    
    private Long id;

    private String nome;

    private EnumTipoFormulario tipoFormulario;

    public FormularioPdf(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.tipoFormulario = EnumTipoFormulario.PDF;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return "Formulário PDF: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumTipoFormulario getTipoFormulario() {
        return tipoFormulario;
    }
    
}
