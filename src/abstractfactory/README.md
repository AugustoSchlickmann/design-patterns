An abstract factory is a factory of factories.
Esse padrão de projeto é usado para criar objetos sem especificar a classe exata do objeto que será criado.
Ele fornece uma interface para criar **famílias de objetos** relacionados ou dependentes sem especificar suas classes concretas.
O padrão Abstract Factory é uma maneira de encapsular a criação de objetos em um nível mais alto do que o padrão Factory Method.
Ele é útil quando você precisa criar objetos que pertencem a uma família de classes relacionadas, mas não quer expor a lógica de criação ao cliente.
O padrão Abstract Factory é frequentemente usado em conjunto com o padrão Factory Method


O problema que queremos resolver é o seguinte:
Minha aplicação possui tipos de Anexos, sendo eles: Peça, Formulário e Upload
Quando eu preciso imprimir um desses anexos, eu preciso chamar o método de:
    1. criação do anexo
    2. validação do anexo
    3. nomeação do anexo

O problema é que cada anexo tem uma forma diferente de ser criado, validado e nomeado
O que eu quero fazer é:
    1. criar 3 interfaces que definam os métodos de criação, validação e nomeação
    2. criar a Factory, que é uma classe abstrata (ou uma interface) que implemente essas interfaces de criação, validação e nomeação
    3. depois criar classes concretas que estendam essa classe abstrata (ou implementam a interface)
    4. depois criar uma classe que chame os métodos de criação, validação e nomeação da classe abstrata

