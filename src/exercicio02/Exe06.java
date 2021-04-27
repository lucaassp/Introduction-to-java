package exercicio02;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = 0;
		int u = 1;
		int n = input.nextInt();
		
		if (n == 1) {
			System.out.print("0");
		} else if (n >=2) {
			System.out.print("0 1");
		}
		
		for (int i = 3; i <= n; i++) {
			int t = u;
			u = p + u;
			p = t;
			System.out.print(" "+u);
		}
		System.out.println();
		input.close();
	}
}
