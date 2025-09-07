package bridge;

public class RenderizadorHtml implements RenderizadorFormulario {

    @Override
    public String renderizarLabel(String texto) {
        return String.format("<label for=\"%s\" class=\"col-sm-2 control-label\">%s</label>", texto.toLowerCase(),
                texto);
    }

    @Override
    public String renderizarInput(String tipo, String id) {
        return String.format("<input type=\"%s\" class=\"form-control\" id=\"%s\">", tipo, id);
    }

    @Override
    public String renderizarFormulario(String conteudo) {
        return """
                <form class="form-horizontal">
                    <div class="form-group">
                        %s
                    </div>
                </form>
                """.formatted(conteudo);
    }
}