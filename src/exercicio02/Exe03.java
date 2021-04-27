package exercicio02;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.nextLine();
		double salario = Double.parseDouble(input.nextLine());
		double vendas = Double.parseDouble(input.nextLine());
		
		double total = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		input.close();
	}
}
