package bridge;

public class FormularioCampoUnico extends Formulario {

    private final String label;
    private final String id;
    private final String tipoInput;

    public FormularioCampoUnico(String label, String id, String tipoInput, RenderizadorFormulario renderizador) {
        super(renderizador);
        this.label = label;
        this.id = id;
        this.tipoInput = tipoInput;
    }

    @Override
    public String gerar() {
        String labelHtml = this.renderizador.renderizarLabel(this.label);
        String inputHtml = this.renderizador.renderizarInput(this.tipoInput, this.id);

        String conteudo = labelHtml + "\n<div class=\"col-sm-10\">\n" + inputHtml + "\n</div>";
        return this.renderizador.renderizarFormulario(conteudo);
    }
}