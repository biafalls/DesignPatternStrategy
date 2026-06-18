# Design Pattern Strategy

## Descrição

O padrão de projeto **Strategy** é um padrão comportamental que permite definir uma família de algoritmos ou comportamentos, encapsulá-los em classes separadas e torná-los intercambiáveis durante a execução do sistema.

Seu principal objetivo é substituir estruturas complexas de decisão, como múltiplos `if/else` ou `switch`, por uma solução mais organizada e flexível. Cada comportamento é implementado em uma classe específica que segue uma mesma interface, permitindo a adição de novas estratégias sem a necessidade de modificar o código existente.

## Estrutura do Padrão

O padrão Strategy é composto por três elementos principais:

* **Strategy:** Interface que define o comportamento comum das estratégias.
* **Concrete Strategy:** Implementações concretas da interface, responsáveis por executar comportamentos específicos.
* **Context:** Classe que utiliza uma estratégia e delega a ela a execução da ação desejada.

## Vantagens

* Reduz o uso excessivo de estruturas condicionais.
* Facilita a manutenção e evolução do sistema.
* Promove o reaproveitamento de código.
* Segue o princípio Open/Closed (Aberto para Extensão e Fechado para Modificação).
* Permite alterar comportamentos em tempo de execução.

## Exemplo de Aplicação

Um exemplo comum de utilização do Strategy é em sistemas de pagamento. Cada forma de pagamento, como PIX, Cartão de Crédito ou Boleto, pode ser implementada como uma estratégia diferente. O sistema escolhe qual estratégia utilizar sem precisar alterar sua lógica principal, tornando a solução mais flexível e escalável.

## Conclusão

O padrão Strategy é uma solução eficiente para cenários em que diferentes algoritmos ou comportamentos podem ser utilizados para resolver o mesmo problema. Sua aplicação contribui para a organização do código, facilita futuras manutenções e melhora a extensibilidade do sistema.
