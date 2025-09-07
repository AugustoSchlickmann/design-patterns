package bridge;

public interface RenderizadorFormulario {

    String renderizarLabel(String texto);

    String renderizarInput(String tipo, String id);

    String renderizarFormulario(String conteudo);
}