package strategy;

public class ExecuteStrategy {

    public static void main(String[] args) {

        Gerador gerador = new Gerador();

        // INTERCAMBIALIDADE
        gerador.gerar(new GeradorFormularioNome());
        gerador.gerar(new GeradorFormularioEmail());
        gerador.gerar(new GeradorFormularioTelefone());
    }

}
