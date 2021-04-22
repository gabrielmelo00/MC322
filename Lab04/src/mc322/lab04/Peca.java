package mc322.lab04;

public class Peca {

	Tabuleiro tab; 
	int source_j;
	int source_i;
	int target_j;
	int target_i;
	int middle;
	// horizontal -> 0 vertical ->1
	int direcao; 
	
	Peca(Tabuleiro tab){
		this.tab = tab;
	}
	
	
	int[] leitura(String jogada) {
		int j = 0;
		int i = Character.getNumericValue(jogada.charAt(1)) - 1;
		switch(jogada.charAt(0)) {
		case 'a': j = 0; break;
		case 'b': j = 1; break;
		case 'c': j = 2; break;
		case 'd': j = 3; break;
		case 'e': j = 4; break;
		case 'f': j = 5; break;
		case 'g': j = 6; break;
		}
		int [] saida = {i,j};
		return saida;
	}
	
	boolean validaMovimento() {
		// target não pode ter peça		
		if(tab.tabuleiro[target_i][target_j] != '-') {
			return false;
		}
		//movimento só pode na horizontal e vertical
		else if((source_j != target_j) && (source_i != target_i) ) {
			return false;
		}
		//entre source e target tem que ter apenas uma casa com uma peça
		else {
			if(source_j == target_j) {
				direcao = 1;
				if(Math.abs(source_i - target_i) != 2) {
					return false;
				}
				else {
					if(source_i > target_i) {
						middle = source_i - 1;
					}
					else {
						middle = source_i + 1;
					}
					if(tab.tabuleiro[middle][source_j] != 'P') {
						return false;
					}
				}
			}
			else {
				direcao = 0;
				if(Math.abs(source_j - target_j) != 2) {
					return false;
				}
				else {
					if(source_j > target_j) {
						middle = source_j -1;
					}
					else {
						middle = source_j +1;
					}
					if(tab.tabuleiro[source_i][middle] != 'P') {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	void moverPeca(String movimento) {
		String[] jogadas = movimento.split(":");
		int[] source = leitura(jogadas[0]);
		int[] target = leitura(jogadas[1]);
		source_i = source[0];
		source_j = source[1];
		target_i = target[0];
		target_j = target[1];
		if(validaMovimento()) {
			tab.tabuleiro[source_i][source_j] = '-';
			tab.tabuleiro[target_i][target_j] = 'P';
			if(direcao == 0) {
				tab.tabuleiro[source_i][middle] = '-';
			}
			else {
				tab.tabuleiro[middle][source_j] = '-';
			}
		}
	}
	
}
