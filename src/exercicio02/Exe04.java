package exercicio02;

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        

        for (int i = 0; i < number; i++) {
            int x = input.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            } else if (x > 0){
            	if (x % 2 == 0) {
            		System.out.println("EVENN POSITIVE");
            	} else {
            		System.out.println("ODD POSITIVE");
            	}	
            } else {
            	if (x % 2 == 0) {
            		System.out.println("EVENN NEGATIVE");
            	}else {
            		System.out.println("ODD NEGATIVE");
            	}
            }
        }
        input.close();
    }
}