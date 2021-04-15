# LAB01 - Lombriga no Aquário

## Classe Aquário e Lombriga

Será construída uma classe em Java em que cada objeto representa uma lombriga em um aquário. A representção da lombriga em um aquário será da seguinte forma:

~~~
##@@@O##
~~~

Onde:
* `#` - representa o aquário;
* `@` - representa o corpo da lombriga;
* `O` - representa a cabeça da lombriga.

### Métodos

* `construtor` - no construtor é informado como parâmetro: o tamanho do aquário, o tamanho da lombriga e a posição da lombriga no aquário;
* `crescer` - a lombriga cresce uma unidade dentro do aquário somente se houver espaço para ela crescer na direção oposta à cabeça -- a lombriga só cresce se houver espaço no aquário na direção do crescimento, caso contrário, ela não crescerá, mesmo que o método seja chamado;
* `mover` - a lombriga se move uma unidade na direção para a qual está virada à cabeça; se ela estiver no limite do aquário (para o lado que ela está virada a cabeça) e for chamado este método ela vira de lado em vez de andar;
* `virar` - a lombriga vira de lado;
* `apresenta` - retorna uma String contendo a apresentação da lombriga no aquário no estado atual, conforme foi descrito anteriormente.

## Classe Animação

Será construída uma classe em Java que representa uma sequência de ações para animar uma lombriga em um aquário.  A ações da lombriga serão dadas da seguinte forma:

~~~
AALLPPMVC
~~~

Onde:
* `AA` - é um número (sempre ocupando dois caracteres) representando o tamanho do aquário; por exemplo, `08` representa um aquário de tamanho 8;
* `LL` - é um número (sempre ocupando dois caracteres) representando o tamanho da lombriga; por exemplo, `04` representa uma lombriga de tamanho 4;
* `PP` - é um número (sempre ocupando dois caracteres) representando a posição inicial da lombriga no aquário -- a lombriga começa sempre virada para a direita, portanto trata-se da posição da ponta da cauda; por exemplo, `03` representa uma lombriga na posição 3;
* `C` - a lombriga cresce;
* `M` - a lombriga se move;
* `V` - a lombriga vira.

### Métodos
* `construtor` - no construtor é informado como parâmetro: a string de animação, conforme a descrição anterior;
* `apresenta` - retorna uma String com a lombriga no aquário no estado atual (a primeira vez que o método é chamado, apresenta o estado inicial da lombriga - sem animação);
* `passo` - executa um único passo da animação.

## Casos Especiais
* Caso for especificada uma lombriga maior que o aquário, então o tamanho do aquário passa a ser o tamanho da lombriga somada à posição da lombriga;
* Caso a  lombriga não couber na posição especificada, entã coloca-se a lombriga na posição 1.

## Notebook sobre Lombriga no Aquário
* A resolução no Jupyter deste laboratório está presente nesse link: [notebook](https://github.com/gabrielmelo00/MC322/blob/main/Lab03/notebook/lab-lombriga-ra216474.ipynb)

## Arquivos Java sobre Lombriga no Aquário
* A resolução no Eclipse deste laboratório está presente nesse link: [src](https://github.com/gabrielmelo00/MC322/tree/main/Lab03/src/mc322/lab03)
