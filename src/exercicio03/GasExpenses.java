/* Considere outro programa que l� os gastos com gasolina de uma pessoa em 5
* abastecimentos. Para cada abastecimento se l� a quantidade de litros
* abastecidos e o pre�o da gasolina. Ao final o programa deve imprimir a m�dia
* do valor total pago por abastecimento e qual o menor valor total pago dentre
* os 5 abastecimentos. Qual das seguintes classes � um programa que faz o que �
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
			
			System.out.println("Informe o pre�o do combustivel: ");
			double gasolinePrice = Double.parseDouble(input.nextLine());
			
			double total = (amountLiters * gasolinePrice);
			sumSpending += total;
			
			if(total < lowerValue || lowerValue == 0) {
				lowerValue = total;
			}
		}
		System.out.printf("O menor valor: %.2f\n", lowerValue);
		System.out.printf("A m�dia de gastos �: R$ %.2f", sumSpending/5);
		input.close();
	}
}
