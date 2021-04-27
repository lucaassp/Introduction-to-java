package estagio3;

public class Mamifero extends Animal {
	private int quantidadeMesesGestacao;
	
	public Mamifero() {
	}

	public Mamifero(String codigo, String nome, double idade, int quantidadeMesesGestacao) {
		super(codigo, nome, idade);
		this.quantidadeMesesGestacao = quantidadeMesesGestacao;
	}


	public int getQuantidadeMesesGestacao() {
		return quantidadeMesesGestacao;
	}

	public void setQuantidadeMesesGestacao(int quantidadeMesesGestacao) {
		this.quantidadeMesesGestacao = quantidadeMesesGestacao;
	}


	@Override
	public String getTipo() {
		return "MAMÍFERO";
	}
	
	
}
