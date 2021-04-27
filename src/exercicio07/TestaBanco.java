package exercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaBanco {
	public static void main(String [] args) {
		BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new ArrayList<Conta>());
		
		meuBanco.abrirConta("333.333.333-33", "555-5", "444-4", -180);
		System.out.println(meuBanco.consultarSaldoDeConta("555-5", "444-4"));
		
		meuBanco.abrirConta("444.444.444-44", "666-6", "477-7", -10);
		System.out.println(meuBanco.consultarSaldoDeConta("666-6", "477-7"));
		
		meuBanco.abrirConta("666.666.666-89", "575-7", "434-8", -120);
		System.out.println(meuBanco.consultarSaldoDeConta("575-7", "434-8"));

		meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
		System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));
		
		meuBanco.abrirConta("118.981.474-93", "450-7", "277-7",350);
		System.out.println(meuBanco.consultarSaldoDeConta("450-7", "277-7"));
		
		meuBanco.transferir("222-2", "333-3", "450-7", "277-7", 100);
		System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3"));
		System.out.println(meuBanco.consultarSaldoDeConta("450-7", "277-7"));
		
		System.out.println(meuBanco.pesquisarContasComSaldoNegativo());
		
	}
}
