<center><h1>Chain Of Responsability</h1></center>

***

## Problemas que o padrão se propõe a resolver

* Evitar o acoplamento entre o remetente de uma solicitação e o receptor.
* Permitir que mais de um objeto possa atender alguma requisição.

## Soluções

* Definir uma linha (cadeia) de objetos onde cada um poderá reponder àquela solicitação ou enviar para o próximo objeto tratá-la.
* Quem realiza a solicitação não precisa saber o tamanho da cadeia, ou mesmo como ela será resolvida.