package exercicio10;

public abstract class Conta {
	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	
	public Conta() {
	}

	public Conta(String cpf, String numC, String numAg, double saldo) {
		this.cpfTitular = cpf;
		this.numeroConta = numC;
		this.numeroAgencia = numAg;
		this.saldo = saldo;
	}
	
	public abstract double getSaldoDisponivel();

	public String getCfpTitular() {
		return cpfTitular;
	}

	public void setCfpTitular(String cfpTitular) {
		this.cpfTitular = cfpTitular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double creditar(double valor) {
		return this.saldo += valor;
	}

	public double debitar(double valor) {
		if (this.saldo >= valor) {
			return this.saldo -= valor;
		}
		return this.saldo;
	}
}
