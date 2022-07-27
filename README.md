Exercícios da próxima aula (28/07):

3 - Escreva um programa Java que leia um arquivo TXT, caso não localize adicione um tratamento.
4 - Escreva uma função que receba um parametro do tipo inteiro entre 0 e 100, caso o valor informado for fora do range, retorne uma excecao de IllegalArgumentException

Até agora discutimos todas as exceções que são incorporadas ou fornecidas pela linguagem Java. Além dessas exceções, também podemos definir nossas próprias exceções. Elas são chamadas de exceções personalizadas ou exceções definidas pelo usuário.
Usando exceções personalizadas, podemos definir nossas exceções de acordo com nossas necessidades.

5- Escreva uma função que receba um parametro o tipo inteiro, caso o valor informado for menor que 20 retorne uma exceção personalizada (crie uma exceção personalizada herdando da classe Exception).

6- Crie uma classe chamada veículo com 2 propriedades ( placa e chassi),  adicione uma validação para que a placa tenha 7 digitos no minimo e que nao seja null. O erro deve ser uma excecao criada por você para validar, após crie na pasta aplicação AppVeiculo01 e envie uma placa com 7 digitos e uma com 4 digitos.

Em Java, o bloco finally é sempre executado, independentemente de haver uma exceção ou não.
O bloco finally é opcional. E, para cada bloco try, pode haver apenas um bloco finally.

7- Crie uma aplicação onde o usuario irá informar 2 numeros, divida um pelo outro. Adicione um tratamento ArithmeticException e um finally com uma informação se o codigo executou corretamente ou nao.
