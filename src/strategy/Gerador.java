package strategy;

public class Gerador {

    public void gerar(GeradorStrategy geradorFormulario) {
        String html = geradorFormulario.gerar();

        System.out.println(html);
    }

}
