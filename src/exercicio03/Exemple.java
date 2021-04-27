package exercicio03;

import java.util.Scanner;

public class Exemple {
	/* 3 Ipiranga 3.40 2.40 BR 3.40 2.80 Posto Legal 3.40 2.70 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Para quantos postos será a pequisa? ");
		int quant =  Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < quant; i++) {
			System.out.println("Qual nome do posto? ");
			String name = input.nextLine();
			
			System.out.println("Quantidade de litros? ");
			double amountLiters = Double.parseDouble(input.nextLine());
			
			System.out.println("Qual preço do litro da gasolina? ");
			double priceGasoline = Double.parseDouble(input.nextLine());
			
			System.out.println("Preço do litro do etanol? ");
			double priceEthanol = Double.parseDouble(input.nextLine());
			
			if(priceEthanol < 0.70 * priceGasoline) {
				System.out.println("Melhor abastecer com Etanol!");
				System.out.println("Total a pagar: " + (amountLiters * priceEthanol));
			} else {
				System.out.println("Melhor abastecer com gasolina!");
				System.out.println("Total a pagar: " + (amountLiters * priceGasoline));
			}
			System.out.println();
		}
		System.out.println("Fim do programa");
		input.close();
	}
}
