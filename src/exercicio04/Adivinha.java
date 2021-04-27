/* Modifique a classe Adivinha para que seja sorteado um 
 * n�mero de 0 a 100 e para que quando o jogador errar, 
 * o programa indique se o n�mero sorteado � maior ou menor 
 * que o valor que foi digitado, perdendo 2 pontos a cada erro. 
 * Ao final, o programa deve indicar quantos pontos o jogador obteve. 
 * Coloque aqui o c�digo do seu programa.*/
package exercicio04;

import java.util.Scanner;

public class Adivinha {

	public static int sorteiaNumeroInteiro(int maximo) {
		int x = (int) (Math.random()*(maximo+1)); //gera n�mero inteiro aleat�rio entre [0-maximo]
		return x;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int maxNum = 100;
        int pontos = 100;
		int y = sorteiaNumeroInteiro(maxNum);
		System.out.println(y);
		boolean acertou = true;
		int tentativas = 0;
		while(acertou) {
			System.out.println("Tente adivinhar y [0-100+]:");
			int numLido = Integer.parseInt(leitor.nextLine());
			tentativas++;
			if(numLido < y) {
				System.out.println("O numero lido � MENOR que Y");
				pontos-=2;
			} else if(numLido > y) {
				System.out.println("O numero lido � MAIOR que Y");
				pontos-=2;
			} else if (numLido == y) {
				System.out.printf("Parab�ns! Voc� acertou. N�mero de tentativas %d\n:", tentativas);
				System.out.printf("Seus pontos s�o: %d", pontos);
				acertou = false;
			}
		}
		leitor.close();
	}
}