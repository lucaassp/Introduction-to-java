/* Considere outro programa que lê os gastos com gasolina de uma pessoa em 5
* abastecimentos. Para cada abastecimento se lê a quantidade de litros
* abastecidos e o preço da gasolina. Ao final o programa deve imprimir a média
* do valor total pago por abastecimento e qual o menor valor total pago dentre
* os 5 abastecimentos. Qual das seguintes classes é um programa que faz o que é
* pedido? */

package exercicio03;

import java.util.Scanner;

public class GasExpenses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sumSpending  = 0;
		double lowerValue = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe a quantidade de litros: ");
			double amountLiters = Double.parseDouble(input.nextLine());
			
			System.out.println("Informe o preço do combustivel: ");
			double gasolinePrice = Double.parseDouble(input.nextLine());
			
			double total = (amountLiters * gasolinePrice);
			sumSpending += total;
			
			if(total < lowerValue || lowerValue == 0) {
				lowerValue = total;
			}
		}
		System.out.printf("O menor valor: %.2f\n", lowerValue);
		System.out.printf("A média de gastos é: R$ %.2f", sumSpending/5);
		input.close();
	}
}
