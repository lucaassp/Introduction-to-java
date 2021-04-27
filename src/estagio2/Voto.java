package estagio2;

public class Voto {
	private String nomeEleitor;
	private String numeroTituloEleitor;
	private int numeroVotado;

	public Voto() {
		this("", "", 0);
	}

	public Voto(String nomeEleitor, String numeroTituloEleitor, int numeroVotado) {
		this.nomeEleitor = nomeEleitor;
		this.numeroTituloEleitor = numeroTituloEleitor;
		this.numeroVotado = numeroVotado;
	}

	public String getNomeEleitor() {
		return nomeEleitor;
	}

	public void setNomeEleitor(String nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}

	public int getNumeroVotado() {
		return numeroVotado;
	}

	public void setNumeroVotado(int numeroVotado) {
		this.numeroVotado = numeroVotado;
	}

	public String getNumeroTituloEleitor() {
		return numeroTituloEleitor;
	}

	public void setNumeroTituloEleitor(String numeroTituloEleitor) {
		this.numeroTituloEleitor = numeroTituloEleitor;
	}

	@Override()
	  public String toString() {
	    return "Voto para o(a) candidato(a) número "+ this.numeroVotado;
	  }
	
	
//...
}