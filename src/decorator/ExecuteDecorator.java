package decorator;

public class ExecuteDecorator {

    public static void main(String[] args) {
        Request request = new Request();

        System.out.println("REQUISIÇÕES DECORADAS APENAS COM AUDITORIA");
        AuditoriaDecorator auditoriaDecorator = new AuditoriaDecorator(request);
        Elemento elemento = auditoriaDecorator.create();
        auditoriaDecorator.read(elemento);
        auditoriaDecorator.update(elemento);
        auditoriaDecorator.delete(elemento);

        System.out.println("<------------------------------------------------------------------>");

        System.out.println("REQUISIÇÕES DECORADAS APENAS COM FILA");
        FilaDecorator filaDecorator = new FilaDecorator(request);
        elemento = filaDecorator.create();
        filaDecorator.read(elemento);
        filaDecorator.update(elemento);
        filaDecorator.delete(elemento);

        System.out.println("<------------------------------------------------------------------>");

        System.out.println("REQUISIÇÕES DECORADAS COM AUDITORIA E APÓS AUDITAR INSERIR NA FILA");
        FilaDecorator filaAuditadaDecorator = new FilaDecorator(auditoriaDecorator);
        elemento = filaAuditadaDecorator.create();
        filaAuditadaDecorator.read(elemento);
        filaAuditadaDecorator.update(elemento);
        filaAuditadaDecorator.delete(elemento);

    }


}
