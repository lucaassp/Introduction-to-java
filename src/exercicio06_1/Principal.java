package exercicio06_1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas refeições foram servidas hoje?");
		int quantidadeAlmoco = Integer.parseInt(sc.nextLine());
		double[] almocos = new double[quantidadeAlmoco];
		double total = 0;
		for (int i = 0; i < almocos.length; i++) {
			System.out.println("Preço do almoço: ");
			double valorAlmoco = Double.parseDouble(sc.nextLine());
			almocos[i] = valorAlmoco;
			total += almocos[i];
		}
		
		System.out.println("Total a ser pago: " + String.format("R$ %.2f", total));
		sc.close();
	}
}
