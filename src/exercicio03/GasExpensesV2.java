/*Considerando o programa pedido na quest�o 3, como voc� poderia modific�-lo para guardar em um
array os valores totais e s� depois de ler todos os valores, fora do la�o, indicar o menor valor pago e a
m�dia dos abastecimentos?*/

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
			
			System.out.println("Informe o pre�o do combustivel: ");
			double gasolinePrice = Double.parseDouble(input.nextLine());
			
			total[i] = (amountLiters * gasolinePrice);
			sumSpending += total[i];
			
			if(total[i] < lowerValue || lowerValue == 0) {
				lowerValue = total[i];
			}
		}
		System.out.printf("O menor valor: %.2f\n", lowerValue);
		System.out.printf("A m�dia de gastos �: R$ %.2f", sumSpending/5);
		input.close();
	}
}
