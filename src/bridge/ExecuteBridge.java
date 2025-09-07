package bridge;

public class ExecuteBridge {

    public static void main(String[] args) {
        // 1. Escolhemos a implementação que queremos usar (o "como")
        RenderizadorFormulario renderizadorHtml = new RenderizadorHtml();

        // 2. Criamos as abstrações (o "quê"), injetando a implementação
        Formulario formNome = new FormularioCampoUnico("Nome", "nome", "text", renderizadorHtml);
        Formulario formEmail = new FormularioCampoUnico("Email", "email", "email", renderizadorHtml);
        Formulario formTelefone = new FormularioCampoUnico("Telefone", "telefone", "phone", renderizadorHtml);

        // 3. Usamos as abstrações. Elas delegarão a renderização para a implementação.
        System.out.println("--- Formulário de Nome (HTML) ---");
        System.out.println(formNome.gerar());

        System.out.println("\n--- Formulário de Email (HTML) ---");
        System.out.println(formEmail.gerar());

        System.out.println("\n--- Formulário de Telefone (HTML) ---");
        System.out.println(formTelefone.gerar());
    }
}