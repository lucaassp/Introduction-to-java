package exercicio07;

public class Conta {
	private String cpfTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	
	public Conta() {
		this("", "", "", 0.0);
	}

	public Conta(String cpf, String numC, String numA, double saldo) {
		super();
		this.cpfTitular = cpf;
		this.numeroConta = numC;
		this.numeroAgencia = numA;
		this.saldo = saldo;
	}
	
	public String getCpfTitular() {
		return cpfTitular;
	}
	
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
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
	
	public String toString() {
		return "Conta número: " + this.numeroConta + 
				"\nCliente CPF: " + this.cpfTitular;
	}
	
	public double creditar(double valor) {
		this.saldo += valor;
		return this.saldo;
	}

	public double debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
		return this.saldo;
	}

	public double getSaldoDisponivel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
