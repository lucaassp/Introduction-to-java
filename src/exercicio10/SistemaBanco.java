package exercicio10;

import java.util.ArrayList;
import java.util.List;

public interface SistemaBanco {

	public void transferir(String numContaO, String numAgO, String numContaD, String numAgenciaD, double valor);

	public void abrirConta(Conta novaConta);
	
	public ArrayList<Conta> pesquisarContasComSaldoNegativo();

	public List<Conta> pesquisarContasDoCliente(String cpfCliente);

	public double consultarSaldoDisponivelDeConta(String numConta, String numAgencia);

	public double consultarSaldoDeConta(String numConta, String numAgencia);

	public boolean sacarDeConta(String numConta, String numAgencia, double valor);

	public boolean depositarConta(String numConta, String numAgencia, double valor);

	

}