package exercicio06;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many products do you want to buy?");
		int amount = Integer.parseInt(sc.nextLine());
		Product[] product = new Product[amount];
		for (int k = 0; k < amount; k++) {
			Product p = new Product();
			System.out.println("What product name?");
			p.setName(sc.nextLine());
			System.out.println("What is the original price of the product?");
			p.setPrice(Double.parseDouble(sc.nextLine()));
			product[k] = p;
		}
		
		double summation = ProgramaDescontos.sumOfDiscount(product);
		
		System.out.println("O somatório do produto: " + String.format("R$ %.2f", summation));
		System.out.println("O produto de maior Desconto: " + ProgramaDescontos.checksHigherDiscount(product));
		
		sc.close();
	}
}
