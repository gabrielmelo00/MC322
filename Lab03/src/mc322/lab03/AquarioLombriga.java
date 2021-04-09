package mc322.lab03;

public class AquarioLombriga {
	char[] aquario;
    int tamanhoAquario;
    int tamanhoLombriga;
    int posicaoLombriga;
    int orientaLombriga;
    // 1: para direita  0: para esquerda
    
    AquarioLombriga(int tamanhoAquario, int tamanhoLombriga, int posicaoLombriga) {
    	orientaLombriga = 1;
    	
    	if(tamanhoLombriga > tamanhoAquario) {
    		tamanhoAquario = tamanhoLombriga + posicaoLombriga;
    	}
    	else if((posicaoLombriga + tamanhoLombriga - 1) > tamanhoAquario) {
    		posicaoLombriga = 1;
    	}
    	
    	this.tamanhoLombriga = tamanhoLombriga;
    	this.tamanhoAquario = tamanhoAquario;
    	this.posicaoLombriga = posicaoLombriga;
    	
    	
    	aquario = new char[tamanhoAquario];
    	
    	for(int i = 1;i <= tamanhoAquario;i++) {
    		if(i < posicaoLombriga) {
    			aquario[i - 1] = '#';
    		}
    		else if(i < (posicaoLombriga + tamanhoLombriga - 1)) {
    			aquario[i - 1] = '@';
    		}
    		else if(i == (posicaoLombriga + tamanhoLombriga - 1)) {
    			aquario[i - 1] = 'O';
    		}
    		else {
    			aquario[i - 1] = '#';
    		}
    	}
    }
    
    void crescer() {
    	if(orientaLombriga == 1) {
    		if(posicaoLombriga > 1) {
    			posicaoLombriga--;
    			aquario[posicaoLombriga - 1] = '@';
    			tamanhoLombriga++;
    		}
    	}else {
    		if(posicaoLombriga < tamanhoAquario) {
    			posicaoLombriga++;
    			aquario[posicaoLombriga - 1] = '@';
    			tamanhoLombriga++;
    		}
    	}
    }
    
    void mover() {
    	int cabeca = 0;
    	
    	if(orientaLombriga == 1) {
    		cabeca = (posicaoLombriga + tamanhoLombriga - 1);
    		if(cabeca < tamanhoAquario) {
    			aquario[posicaoLombriga - 1] = '#';
    			aquario[cabeca - 1] = '@';
    			aquario[(cabeca + 1) - 1] = 'O';
    			posicaoLombriga++;
    		}
    		else if(cabeca == tamanhoAquario) {
    			virar();
    		}
    	}else {
    		cabeca = (posicaoLombriga - tamanhoLombriga + 1);
    		if(cabeca > 1) {
    			aquario[posicaoLombriga - 1] = '#';
    			aquario[cabeca - 1] = '@';
    			aquario[(cabeca - 1) - 1] = 'O';
    			posicaoLombriga--;
    		}
    		else if(cabeca == 1) {
    			virar();
    		}
    	}
    }
    
    void virar() {
    	int cabeca = 0;
    	
    	if(orientaLombriga == 1) {
    		cabeca = (posicaoLombriga + tamanhoLombriga - 1);
    		orientaLombriga = 0;
    	}else {
    		cabeca = (posicaoLombriga - tamanhoLombriga + 1);
    		orientaLombriga = 1;
    	}
    	aquario[cabeca - 1] = '@';
		aquario[posicaoLombriga - 1] = 'O';
		posicaoLombriga = cabeca;
    }
    
    String apresenta() {
    	String aqu = "";
    	for(int i = 0;i < tamanhoAquario;i++) {
    		aqu += aquario[i];
    	}
    	return(aqu);
    }
}
