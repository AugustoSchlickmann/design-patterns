O Padrão Decorator é usado quando a herança é inviável, pois há muitas combinações diferentes
Esse padrão anexa responsabilidades adicionais a um objeto dinamicamente
Forne uma alternativa flexível em relação à herança para estender funcionalidades
Usa-se composição no lugar de herança

Em vez de reescrever o código velho ou mexer no que já existe, você o estende com código novo

# O problema que queremos resolver é o seguinte:
Iremos simular uma aplicação que recebe requisições de clientes com certas ações, por exemplo:
    1. Criar        Create  (C)
    2. Ler          Read    (R)
    3. Atualizar    Update  (U)
    4. Deletar      Delete  (D)

Após a função da ação ser chamada eu preciso enviar para o sitema de auditoria os dados da requisição
porém não iremos implementar a auditoria no método responsável pela lógica principal da requisição
e sim implementar um decorator, que irá decorar a função principal com a lógica da auditoria

1. Criar a interface Acao
2. Criar a classe core responsável pela lógica das requisições que implementa a interface Acao
3. Criar a classe abstrata Decorator que implementa a interface Acao
4. Criar a classe AuditoriaDecorator que estende o Decorator e realizar a implementação da auditoria nesta classe
4. Criar a classe FilaDecorator que estende o Decorator e realizar a implementação de colocar o elemento na fila nesta classe

Agora vamos supor que após feito a auditoria eu preciso colocar esse Elemento em uma fila de mensagens
