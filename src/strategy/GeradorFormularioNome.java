package strategy;

public class GeradorFormularioNome implements GeradorStrategy {

    @Override
    public String gerar() {
        return """
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="nome" class="col-sm-2 control-label">Nome</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="nome">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Sign in</button>
                        </div>
                    </div>
                </form>
                """;
    }

}
