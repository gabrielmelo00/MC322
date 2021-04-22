# LAB04 - Resta Um
Implementar, por meio de classes, um jogo de Resta Um.

## Tabuleiro

O tabuleiro é representado da seguinte forma:

~~~
7     P P P
6     P P P
5 P P P P P P P
4 P P P - P P P
3 P P P P P P P
2     P P P
1     P P P
  a b c d e f g
~~~

Onde `P` representa as peças e `-` representa o espaço vazio.
  
## Entradas
O programa receberá um arquivo `.csv` contendo todas as jogadas que serão executadas. As jogadas serão dadas da seguinte forma:

* `f4:d4` - peça sai da posição `f4` e, se for uma jogada válida, vai para a posição `d4`.

Exemplo de um arquivo [csv]().

## Saídas
O programa exibe cada jogada presente no arquivo `.csv` na saída padrão e as armezena em um vetor de Strings. Caso seja uma jogada inválida, não ocorre alteração do estado.

## Classes

* `CSVReader`- Lê as jogadas no arquivo `.csv`;
* `Tabuleiro` - Gera um objeto tabuleiro e retorna uma String contendo seu estado;
* `Peça` - Lê e executa as jogadas;
* `AppRestaUm` - Executa o jogo.

## Arquivos Java contendo o jogo Resta Um
* A resolução no Eclipse deste laboratório está presente nesse [link]().
