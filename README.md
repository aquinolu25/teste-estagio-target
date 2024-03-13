# Estágio Target Sistemas
## Processo Seletivo de Estágio em Desenvolvimento Java

Este repositório contém perguntas e respostas para avaliar minhas habilidades técnicas.

1) Observe o trecho de código abaixo:

```

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);


```
Ao final do processamento, qual será o valor da variável SOMA?

Resposta da questão 1 : (https://github.com/aquinolu25/teste-estagio-target/blob/main/src/questoes/questaoUm.java) =  91 

*******************************************************************************************************************************************************************

2) Sequência de Fibonacci
Escreva um programa em Java que calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não à sequência.

Resposta: (https://github.com/aquinolu25/teste-estagio-target/blob/main/src/questoes/questaoDois.java)

*******************************************************************************************************************************************************************

3) Lógica de Sequências
   
Resposta: (https://github.com/aquinolu25/teste-estagio-target/blob/main/src/questoes/questaoTres.java)

a) 1, 3, 5, 7, 9
Lógica: O número é sempre igual ao anterior + 2

b) 2, 4, 8, 16, 32, 64, 128
Lógica: O número é sempre o anterior multiplicado por 2

c) 0, 1, 4, 9, 16, 25, 36, 49
Lógica: O número é igual ao anterior acrescido de um número ímpar que segue a sequência 1, 3, 5, 7, 9. Assim sendo 36 - 25 = 11. Contanto, devemos acrescentar 11 + 2 = 13 ao último número, obtendo 36 + 13 = 49

d) 4, 16, 36, 64, 100
Lógica: Por exemplo, 64 é o quadrado de 8, ou seja, 8 ao quadrado. Seguindo essa lógica, o próximo número par depois de 8 é 10. Logo, o quadrado de 10 é 100

e) 1, 1, 2, 3, 5, 8,13
Lógica: Cada número é igual à soma do número atual com o número anterior. Assim, seguindo a sequência de Fibonacci

f) 2,10, 12, 16, 17, 18, 19, 200
Lógica: Uma série composta por todos os números que começam com a letra "d". Portanto, o próximo número em ordem crescente, que também começa com a letra "d", é 200

*******************************************************************************************************************************************************************

4) Descobrindo Interruptores e Lâmpadas
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Resposta: 

Ligaria o primeiro interruptor e o deixaria ligado por alguns minutos
Desligaria o primeiro interruptor e ligaria o segundo interruptor e o deixaria ligado

Primeira visita:
A lampada que estiver acesa, ela está conectada ao segundo interruptor que deixei ligado, a lampada que estiver quente e apagada se trata da lampada do primeiro interruptor

Segunda visita:
A lampada que estivesse apagada e fria seria o que sobrou, o terceiro interruptor. Nessa terceira visita deixaria o segundo e o primeiro interruptor ligados, só para garantir que quando entrasse na sala o terceiro estaria desligado.

*******************************************************************************************************************************************************************
5) Invertendo uma String
Escreva um programa em Java que inverta os caracteres de uma string.

Resposta: (https://github.com/aquinolu25/teste-estagio-target/blob/main/src/questoes/questaoCinco.java)
