package exercicio06_1;

import java.util.Scanner;

public class Teste3 {
	public static int quantidadeAlmoco(RefeicaoRealizada[] almocoArray) {
		int almoco = 0;
		for(int i = 0; i < almocoArray.length; i++) {
			if(almocoArray[i].getTipoRefeicao().equalsIgnoreCase("almo�o")) {
				almoco++;
			}
		}
		return almoco;
	}
	
	public static String refeicaoTipoCafe(RefeicaoRealizada[] cafeArray) {
		String checaCaf� = "";
		for(int i = 0; i < cafeArray.length; i++) {
			if(cafeArray[i].getTipoRefeicao().equalsIgnoreCase("CAF�")) {
				checaCaf� = "Sim";
			} else {
				checaCaf� = "N�o";
			}
		}
		return checaCaf�;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas refei��es foram servidas hoje?");
		int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
		RefeicaoRealizada[] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
		for (int k = 0; k < quantidadeRefeicoes; k++) {
			System.out.println("Matr�cula do(a) aluno(a) [" + (k + 1) + "]: ");
			String matricula = leitor.nextLine();
			System.out.println("Qual o tipo de refei��o? CAF�, ALMO�O ou JANTAR: ");
			String tipoRefeicao = leitor.nextLine();
			refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
			System.out.printf("%s\n", refeicoes[k].toString());
		}
		// TODO: C�digo a acrescentar
		System.out.println("quantidade de refei��o do tipo almo�o: " + quantidadeAlmoco(refeicoes));
		System.out.println("Foi solicitada refei��o do tipo caf�? " + refeicaoTipoCafe(refeicoes));
		System.out.printf("\nFIM DO PROGRAMA");
		leitor.close();
	}	// fim do main
} 	// fim da classe Teste 3
