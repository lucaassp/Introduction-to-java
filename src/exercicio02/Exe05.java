package exercicio02;

import java.util.Scanner;

public class Exe05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int escolha = Integer.parseInt(input.nextLine());
		
		do {
			if (escolha == 1) {
				alcool++;
			} else if (escolha == 2) {
				gasolina++;
			} else if (escolha == 3) {
				diesel++;
			}
			
			escolha = Integer.parseInt(input.nextLine());
		} while(escolha != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		
		input.close();
	}
}
