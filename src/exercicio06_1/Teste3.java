package exercicio06_1;

import java.util.Scanner;

public class Teste3 {
	public static int quantidadeAlmoco(RefeicaoRealizada[] almocoArray) {
		int almoco = 0;
		for(int i = 0; i < almocoArray.length; i++) {
			if(almocoArray[i].getTipoRefeicao().equalsIgnoreCase("almoço")) {
				almoco++;
			}
		}
		return almoco;
	}
	
	public static String refeicaoTipoCafe(RefeicaoRealizada[] cafeArray) {
		String checaCafé = "";
		for(int i = 0; i < cafeArray.length; i++) {
			if(cafeArray[i].getTipoRefeicao().equalsIgnoreCase("CAFÉ")) {
				checaCafé = "Sim";
			} else {
				checaCafé = "Não";
			}
		}
		return checaCafé;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas refeições foram servidas hoje?");
		int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
		RefeicaoRealizada[] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
		for (int k = 0; k < quantidadeRefeicoes; k++) {
			System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]: ");
			String matricula = leitor.nextLine();
			System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR: ");
			String tipoRefeicao = leitor.nextLine();
			refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
			System.out.printf("%s\n", refeicoes[k].toString());
		}
		// TODO: Código a acrescentar
		System.out.println("quantidade de refeição do tipo almoço: " + quantidadeAlmoco(refeicoes));
		System.out.println("Foi solicitada refeição do tipo café? " + refeicaoTipoCafe(refeicoes));
		System.out.printf("\nFIM DO PROGRAMA");
		leitor.close();
	}	// fim do main
} 	// fim da classe Teste 3
