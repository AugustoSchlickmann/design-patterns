package abstractfactory.entidades;

import abstractfactory.EnumTipoFormulario;

public class FormularioHtml extends Formulario {
    
    private Long id;

    private String nome;

    private EnumTipoFormulario tipoFormulario;

    public FormularioHtml(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.tipoFormulario = EnumTipoFormulario.HTML;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String getNome() {
        return "Formulário HTML: " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public EnumTipoFormulario getTipoFormulario() {
        return tipoFormulario;
    }
    
}
