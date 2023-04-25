<center><h1>Builder</h1></center>

***

## Problema que o padrão se propõe a resolver

* Criar diferentes representações de um mesmo objeto complexo (apresenta diversos atributos). Sem precisar criar um construtor para cada conjunto de atributos.

## Soluções

* Delegar a criação do objeto a um builder, não instanciando o objeto concreto diretamente.
* Dividir a criação do objeto em partes, e depois encapsular a criação e montagem das partes em um builder, ou seja, em uma classe separada.

## Formas de aplicação do Builder implementados

* Director (exemplo 1).
* Fluent (exemplo 2).