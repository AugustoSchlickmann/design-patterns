package bridge;

public abstract class Formulario {

    protected RenderizadorFormulario renderizador;

    public Formulario(RenderizadorFormulario renderizador) {
        this.renderizador = renderizador;
    }

    public abstract String gerar();

}