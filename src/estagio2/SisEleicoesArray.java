package estagio2;

import exercicio07.Conta;

public class SisEleicoesArray {
	private Voto[] votos;
	private int quantVotos;

	public SisEleicoesArray() {
		int maxVotos = 1000;
		this.votos = new Voto[maxVotos];
		this.quantVotos = 0;
	}

	public SisEleicoesArray(Voto[] votos, int quantVotos) {
		this.votos = votos;
		this.quantVotos = quantVotos;
	}

	public void cadastrarVoto(String nomeEleitor, String numTitulo, int numeroVotado) {
		if (!eleitorVotou(numTitulo)) {
			Voto voto = new Voto(nomeEleitor, numTitulo, numeroVotado);
			this.votos[quantVotos] = voto;
			quantVotos++;
		}
	}
	
	public int contarQuantidadeDeVotosParaCandidato(int numeroCandidato) {
	    int quantVotos = 0;

	    for (int i = 0; i < this.quantVotos; i++) {
	      if (numeroCandidato == this.votos[i].getNumeroVotado()) {
	        quantVotos++;
	      }
	    }
	    return quantVotos;
	  }

	public boolean eleitorVotou(String numeroTitulo) {
	    boolean cVotou = false;
	    
	    if (this.votos[0] != null) {
	      for (int i = 0; i < this.quantVotos; i++) {
	        if (this.votos[i].getNumeroTituloEleitor().equals(numeroTitulo)) {
	          cVotou = true;
	          break;
	        }
	      }
	    }   
	    return cVotou;
	  }
}
