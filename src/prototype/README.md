O Padrão Prototype é um padrão de design criacional que permite criar novos objetos copiando um objeto existente, conhecido como protótipo. 
Ele é frequentemente usado quando você deseja reutilizar um objeto existente como base para a criação de novos objetos.

# O problema que queremos resolver é o seguinte:
Iremos simular um sistema de encomendas, uma encomenda tem um cliente, data de criação, data de entrega e uma lista de itens.
Quando houver mudanças em uma encomenda (A), queremos copiar todos os dados da encomenda A em uma nova encomenda
e colocar essa encomenda copiada (A.v1) na lista de histórico de encomendas da encomenda A.
Após criar o histórico, a encomenda A poderá ser atualizada com os novos dados.

A encomenda A será o protótipo, e as versões anteriores serão clones desse protótipo.

1. Criar a interface HistoricoPrototype<T>, que define o método `clone` que deve retornar o tipo <T>.
2. Criar as entidades Cliente, Item e Encomenda.
3. Implementar na classe Encomenda e Item a interface HistoricoPrototype.
4. A classe Cliente não precisa implementar a interface HistoricoPrototype, pois não será clonada, será apenas referenciada (Shallow Copy).
5. Por ser uma Shallow Copy, mudanças no cliente de uma encomenda refletirá em todos os históricos da encomenda.




