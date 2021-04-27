package exercicio02;

import java.util.Scanner;

public class Exe02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double A = Double.parseDouble(input.nextLine()); 
		double B = Double.parseDouble(input.nextLine());
		double C = Double.parseDouble(input.nextLine());
		
		double media = (A*2 + B*3 + C*5) / (2 + 3 + 5);
		
		System.out.printf("MEDIA = %.1f\n", media);
		
		input.close();
	}
}
