package exercicio02;

import java.util.Scanner;

public class Exe07 {
	
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
        	int c = 0;
        	int number = input.nextInt();
        	for (int j = 2; j < number; j++) {
        		if (number % j == 0) 
        			c++;
        	}
        	
        	if (c == 0) {
        		System.out.printf("%d eh primo\n", number);
        	} else {
        		System.out.printf("%d nao eh primo\n", number);
        	}
        }
        
        input.close();
    }
	
}