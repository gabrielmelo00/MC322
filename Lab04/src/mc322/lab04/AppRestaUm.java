package mc322.lab04;

public class AppRestaUm {
	
	public static String[] executaJogo(String [] comandos) {
		
		String [] estados = new String[comandos.length+1];
		Tabuleiro meuTabuleiro = new Tabuleiro();
		Peca minhaPeca = new Peca(meuTabuleiro);
		
		System.out.println("Tabuleiro inicial: ");
		System.out.println(meuTabuleiro.retornaEstado());
		estados[0] = meuTabuleiro.retornaEstado();
		
		for(int i = 0; i < comandos.length; i++) {
			minhaPeca.moverPeca(comandos[i]);
			String[] jogadas = comandos[i].split(":");
			estados[i+1] = meuTabuleiro.retornaEstado();			
			System.out.println("Source: " + jogadas[0]);
			System.out.println("Target: " + jogadas[1]);
			System.out.println(meuTabuleiro.retornaEstado());
			
		}
		return estados;
	}
	

	public static void main(String[] args) {
		
		CSVReader csv = new CSVReader();
		csv.setDataSource("../mc322/src/mc322/RestaUm.csv");
		String commands[] = csv.requestCommands();
		
		String[] saida = executaJogo(commands);
		System.out.println("Vetor saida:");
	    for(int i = 0; i < saida.length; i++) {
			System.out.println(saida[i]);
		}
	}
}
