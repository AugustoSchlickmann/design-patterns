package prototype;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public class Encomenda implements HistoricoPrototype<Encomenda> {

    private UUID id;

    private Long dataCriacao;

    private Long dataEntrega;

    private Cliente cliente;

    private Set<Item> itens = new HashSet<>();

    private Set<Encomenda> historico = new LinkedHashSet<>();

    public Encomenda(Long dataCriacao, Long dataEntrega, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.dataCriacao = dataCriacao;
        this.dataEntrega = dataEntrega;
        this.cliente = cliente;
    }

    public Encomenda(Encomenda encomenda) {
        // ID é único, não deve ser clonado
        this.id = UUID.randomUUID();
        
        this.dataCriacao = encomenda.dataCriacao;
        this.dataEntrega = encomenda.dataEntrega;

        // Referência compartilhada, não clone (Shallow Copy)
        this.cliente = encomenda.cliente; 

        // Cada item é clonado integralmente (Deep Copy)
        for (Item i : encomenda.itens) {
            this.itens.add(i.clone());
        }
    }

    public UUID getId() {
        return id;
    }

    public Long getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Long dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Long dataEntrega) {
        this.dataEntrega = dataEntrega;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Set<Item> getItens() {
        return itens;
    }

    public Set<Encomenda> getHistorico() {
        return historico;
    }
    
    @Override
    public Encomenda clone() {
        return new Encomenda(this);
    }

    @Override
    public boolean equals(Object outra) {
        if (this == outra) return true;
        if (outra == null || getClass() != outra.getClass()) return false;

        Encomenda encomenda = (Encomenda) outra;
        return id.equals(encomenda.id);
    }

    @Override
    public String toString() {
        var formater = new SimpleDateFormat();
        formater.applyPattern("dd/MM/yyyy : HH:mm:ss");
        String dataCriacaoFormatada = dataCriacao != null ? formater.format(new Date(dataCriacao)) : "N/A";
        String dataEntregaFormatada = dataEntrega != null ? formater.format(new Date(dataEntrega)) : "N/A";

        return "Encomenda{" +
                "id=" + id +
                ", dataCriacao=" + dataCriacaoFormatada +
                ", dataEntrega=" + dataEntregaFormatada +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }

    public String imprimirComHistorico() {
        if (historico.isEmpty()) {
            return "Encomenda sem modificações. \n" +
                   "========================================\n" +
                   this.toString();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Encomenda com Modificações:\n");
        sb.append("========================================\n");

        int version = 1;
        for (Encomenda e : historico) {
            sb.append("Versão ").append(version++).append(":\n").append(e.toString()).append("\n");
        }

        sb.append("Total de mudanças na Encomenda: ").append(historico.size()).append("\n");
        sb.append("========================================\n");
        sb.append("Versão Atual (").append(version).append("):\n");
        sb.append(this.toString());

        return sb.toString();
    }


}
