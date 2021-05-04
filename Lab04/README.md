# LAB04 - Resta Um
Implementar, por meio de classes, um jogo de Resta Um.

* Observação: este laboratório foi feito em dupla com a aluna Hannah de Oliveira Plath

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

Exemplo de um arquivo [csv](https://github.com/gabrielmelo00/MC322/blob/main/Lab04/data/RestaUm.csv).

## Saídas
O programa exibe cada jogada presente no arquivo `.csv` na saída padrão e as armezena em um vetor de Strings. Caso seja uma jogada inválida, não ocorre alteração do estado.

## Classes

* `CSVReader`- Lê as jogadas no arquivo `.csv`;
* `Tabuleiro` - Gera um objeto tabuleiro e retorna uma String contendo seu estado;
* `Peça` - Lê e executa as jogadas;
* `AppRestaUm` - Executa o jogo.

## Instruções para a execução do Jogo

Para acionar o jogo é necessário:

1. Copiar a pasta Lab04 do github para o seu computador;
2. Criar um arquivo `.csv` contendo as jogadas ou alterar o já existente, [`RestaUm.csv`](https://github.com/gabrielmelo00/MC322/blob/main/Lab04/data/RestaUm.csv);
3. Salvar o arquivo `.csv` na pasta `data`
4. Alterar o parâmetro do método [`setDataSource`](https://github.com/gabrielmelo00/MC322/blob/70fa93f30d90a2e1b08d969b8f93dea71fb4786f/Lab04/src/mc322/lab04/AppRestaUm.java#L31) na linha 31 do `AppRestaUm.java` para o caminho contendo o arquvio `.csv`. Nas configurações atuais de pastas presente neste projeto do github, basta alterar o parâmetro da função para `"../Lab04/data/RestaUm.csv"` e, então, executar o jogo.

## Arquivos Java contendo o jogo Resta Um
* A resolução no Eclipse deste laboratório está presente nesse [link](https://github.com/gabrielmelo00/MC322/tree/main/Lab04/src/mc322/lab04).
