package exercicio02;

import java.util.Scanner;

public class Exe01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A = Integer.parseInt(input.nextLine());
		int B = Integer.parseInt(input.nextLine());
		
		int X = A + B;
		System.out.printf("X = %d", X);
		
		input.close();
	}
}
