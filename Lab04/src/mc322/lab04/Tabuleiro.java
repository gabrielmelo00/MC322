package mc322.lab04;


public class Tabuleiro {
	char[][] tabuleiro;
	
	public Tabuleiro() {
		tabuleiro = new char[7][7];
		for(int i = 0;i < 7;i++) {
			for(int j = 0;j < 7;j++) {
				if(i ==  6 || i == 5 || i == 1 || i == 0) {
					if(j == 2 || j == 3 || j ==4) {
						tabuleiro[i][j] = 'P';
					}
					else {
						tabuleiro[i][j] = ' ';
					}
				}
				else if(i == 4 || i == 2) {
					tabuleiro[i][j] = 'P';
				}
				else {
					if (j == 3) {
						tabuleiro[i][j] = '-';
					}
					else {
						tabuleiro[i][j] = 'P';
					}
				}
			}
		}
	}
	
	String retornaEstado() {
		String estado = "";
		
		for(int i = 6;i > -1;i--) {
			estado += Integer.toString(i+1);
			for(int j = 0;j < 7;j++) {
				estado += " ";
				estado += tabuleiro[i][j];
			}
			estado += "\n";
		}
		String linha_final = "  a b c d e f g\n";
		estado += linha_final;
		return estado;
	}
}
