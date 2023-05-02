<center><h1>Flyweight</h1></center>

***

## Problema que o padrão se propõe a resolver

* Trabalhar com uma grande quantidade de objetos na memória de uma forma mais eficiente.

## Soluções

* Dividir o objeto entre valores intrínsecos (não muda) e extrínsecos (muda).
* Criar um Flywieght para armazenas os valores intrínsecos.
* Clientes compartilham os flyweights, adicionando os valores extrínsecos pontualmente.