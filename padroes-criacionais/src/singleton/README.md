<center><h1>Singleton</h1></center>

***

## Problema(s) que o padrão se propõe a resolver

* Garantir que uma classes tenha apenas uma instância e que possa ser acessado globalmente. 

## Solução

* Esconder o construtor da classe, colocando um modificador de acesso restrito, possibilitando que apenas uma instância da classe seja criada.
* Definir um método estático para a acessar a instância criada. 

## Ponto contra do uso do Sigleton

* Não é possível usar Interfaces, devido ao uso de métodos estátivos. Para resolver isso foi criado uma variação do Singleton, o padrão Monostate. O único problema
do de implementar o Monostate é que durante seu uso não fica implicito que existe uma instância compartilhada.  
