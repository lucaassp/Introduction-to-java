package exercicio10;

public class ContaEspecial extends Conta {
	private Double credito;

	public ContaEspecial() {
	}

	public ContaEspecial(String cpf, String numC, String numAg, double saldo, Double credito) {
		super(cpf, numC, numAg, saldo);
		this.credito = credito;
	}

	public Double getCredito() {
		return credito;
	}

	public void setCredito(Double credito) {
		this.credito = credito;
	}

	@Override
	public double getSaldoDisponivel() {
		return this.credito + super.getSaldo();
	}
}
