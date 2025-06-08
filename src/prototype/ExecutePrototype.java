package prototype;

import java.math.BigDecimal;
import java.util.Objects;

public class ExecutePrototype {

    private final static Long UM_DIA_LONG = 86400000L; // 24 horas em milissegundos
    private final static Long UM_HORA_LONG = 3600000L; // 1 hora em milissegundos
    private final static Long UM_MINUTO_LONG = 60000L; // 1 minuto em milissegundos

    public static void main(String[] args) {
        criarEncomendaSemHistorico();
        System.out.println("--------------------------------------------------");
        criarEncomendaComHistorico();
    }

    private static void criarEncomendaSemHistorico() {
        Cliente cliente = new Cliente("Maria", "987654321");
        Item item1 = new Item("Produto X", BigDecimal.valueOf(15.00), 2);
        Item item2 = new Item("Produto Y", BigDecimal.valueOf(25.00), 1);

        Encomenda encomenda = new Encomenda(System.currentTimeMillis(), System.currentTimeMillis() + UM_DIA_LONG, cliente);
        encomenda.getItens().add(item1);
        encomenda.getItens().add(item2);

        System.out.println(encomenda.imprimirComHistorico());
    }

    private static void criarEncomendaComHistorico() {
        Cliente cliente = new Cliente("João", "123456789");
        Item item1 = new Item("Produto A", BigDecimal.valueOf(10.00), 1);
        Item item2 = new Item("Produto B", BigDecimal.valueOf(20.00), 2);

        Encomenda encomenda = new Encomenda(System.currentTimeMillis(), System.currentTimeMillis() + UM_DIA_LONG, cliente);
        System.err.println("ID Imutável: " + encomenda.getId());
        encomenda.getItens().add(item1);
        encomenda.getItens().add(item2);

        // Clonando a encomenda e salvando em seu histórico antes de modificá-la
        Encomenda encomendaClone = encomenda.clone();
        encomenda.getHistorico().add(encomendaClone);

        // Modificando a encomenda original
        encomenda.getItens().clear();
        encomenda.getItens().add(new Item("Produto C", BigDecimal.valueOf(30.00), 3));

        // Podemos considerar que a data de criação de uma encomenda modificada corresponde ao momento da modificação
        encomenda.setDataCriacao(System.currentTimeMillis() + UM_MINUTO_LONG); 

        // Modificando a data de entrega para uma hora após a data de entrega original
        encomenda.setDataEntrega(encomenda.getDataEntrega() + UM_HORA_LONG);

        Encomenda encomendaClone2 = encomenda.clone();
        encomenda.getHistorico().add(encomendaClone2);

        encomenda.getItens().clear();
        encomenda.getItens().add(new Item("Produto D", BigDecimal.valueOf(99.99), 999));

        encomenda.getCliente().setTelefone("+55 987654321"); // Irá modificar em todos os históricos também

        Encomenda encomendaClone3 = encomenda.clone();
        encomenda.getHistorico().add(encomendaClone3);

        encomenda.getItens().clear();

        System.out.println(encomenda.imprimirComHistorico());

        System.out.println(Objects.equals(encomendaClone, encomendaClone2)); // false
        System.out.println(Objects.equals(encomendaClone, encomendaClone3)); // false
        System.out.println(Objects.equals(encomendaClone2, encomendaClone3)); // false

        System.out.println(encomendaClone.equals(encomendaClone2)); // false
        System.out.println(encomendaClone.equals(encomendaClone3)); // false
        System.out.println(encomendaClone2.equals(encomendaClone3)); // false
    }
}
