/*Considerando o programa pedido na questão 3, como você poderia modificá-lo para guardar em um
array os valores totais e só depois de ler todos os valores, fora do laço, indicar o menor valor pago e a
média dos abastecimentos?*/

package exercicio03;

import java.util.Scanner;

public class GasExpensesV2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double sumSpending  = 0;
		double lowerValue = 0;
		double [] total = new double[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe a quantidade de litros: ");
			double amountLiters = Double.parseDouble(input.nextLine());
			
			System.out.println("Informe o preço do combustivel: ");
			double gasolinePrice = Double.parseDouble(input.nextLine());
			
			total[i] = (amountLiters * gasolinePrice);
			sumSpending += total[i];
			
			if(total[i] < lowerValue || lowerValue == 0) {
				lowerValue = total[i];
			}
		}
		System.out.printf("O menor valor: %.2f\n", lowerValue);
		System.out.printf("A média de gastos é: R$ %.2f", sumSpending/5);
		input.close();
	}
}
