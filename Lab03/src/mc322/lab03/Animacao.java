package mc322.lab03;

public class Animacao{ 
	char[] metodos;
	int AA;
	int LL;
	int PP;
	int estado;
	AquarioLombriga meuAquarioLombriga;
	
	Animacao(String sequenciaMetodos){
		metodos = new char[sequenciaMetodos.length() - 6];
		if(sequenciaMetodos.charAt(0) == '0') {
			AA = Character.getNumericValue(sequenciaMetodos.charAt(1));
		}else {
			AA = 10*Character.getNumericValue(sequenciaMetodos.charAt(0)) + Character.getNumericValue(sequenciaMetodos.charAt(0));
		}
		if(sequenciaMetodos.charAt(2) == '0') {
			LL = Character.getNumericValue(sequenciaMetodos.charAt(3));
		}else {
			LL = 10*Character.getNumericValue(sequenciaMetodos.charAt(2)) + Character.getNumericValue(sequenciaMetodos.charAt(3));
		}
		if(sequenciaMetodos.charAt(4) == '0') {
			PP = Character.getNumericValue(sequenciaMetodos.charAt(5));
		}else {
			PP = 10*Character.getNumericValue(sequenciaMetodos.charAt(4)) + Character.getNumericValue(sequenciaMetodos.charAt(5));
		}
		
		meuAquarioLombriga = new AquarioLombriga(AA,LL,PP);
		
		for(int i = 6;i < sequenciaMetodos.length();i++) {
			metodos[i - 6] = sequenciaMetodos.charAt(i);
		}
		
		estado = 0;
	}
	
	String apresenta() {
    	return(meuAquarioLombriga.apresenta());
	}
	
	void passo() {
		if(estado < metodos.length) {
			switch(metodos[estado]) {
			case 'C':
				meuAquarioLombriga.crescer();
				break;
			case 'M':
				meuAquarioLombriga.mover();
				break;
			case 'V':
				meuAquarioLombriga.virar();
				break;
			}
			estado++;
		}
	}
}
