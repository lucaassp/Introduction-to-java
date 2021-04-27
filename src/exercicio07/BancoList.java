package exercicio07;

import java.util.ArrayList;

import java.util.List;

import exercicio10.SistemaBanco;

public class BancoList {
	private String nome;
	private String cnpj;
	private ArrayList<Conta> contas;

	public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.contas = contas;
	}

	public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
		Conta contaNova = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
		this.contas.add(contaNova);
	}

	public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
		ArrayList<Conta> contaNegativa = new ArrayList<Conta>();
		for (Conta c : this.contas) {
			if (c.getSaldo() < 0) {
				contaNegativa.add(c);
			}
		}
		return contaNegativa;
	}

	public double consultarSaldoDeConta(String numConta, String numAgencia) {
		double saldo = 0;
		for (Conta c : this.contas) {
			if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
				saldo = c.getSaldo();
			}
		}
		return saldo;
	}

	public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor) {
		Conta contaO = null;
		Conta contaD = null;

		for (Conta c : this.contas) {
			if (c.getNumeroAgencia().equals(numAgO) && c.getNumeroConta().equals(numContaO)) {
				contaO = c;
			}
			if (c.getNumeroAgencia().equals(numAgenciaD) && c.getNumeroConta().equals(numContaD)) {
				contaD = c;
			}
		}

		if (contaO != null && contaD != null && contaO.getSaldo() >= valor) {
			contaO.debitar(valor);
			contaD.creditar(valor);
		}
	}

	public void sacarDaConta(double valor) {
		for (Conta c : this.contas) {
			c.getSaldo();
		}
	}
}
