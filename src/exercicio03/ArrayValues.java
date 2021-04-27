/*Crie um método que receba um array de valores e retorne o menor dentre os valores passados.*/

package exercicio03;

import java.util.Scanner;

public class ArrayValues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] total = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe o numero [%d] : ", i);
			total[i] = Double.parseDouble(input.nextLine());
		}
		System.out.println(lowerValueArray(total));
		input.close();
	}
	
	public static double lowerValueArray(double [] array) { 
		double lowerValue = 0;
		if (array.length == 0) {
			return 0;
		} else {
			for(int i = 0; i < array.length; i++) {
			if(array[i] < lowerValue || lowerValue == 0) {
				lowerValue = array[i];
				}
			}
			return lowerValue;
		}
	 }
}
