package exercicio04;

import java.util.Scanner;

public class ProgramaNotas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULANDO NOTAS DA TURMA");
		System.out.println("Quantos alunos há na turma?");
		int numAlunos = Integer.parseInt(leitor.nextLine());
		String[] listaNomes = new String[numAlunos];
		double[] listaNotas = new double[numAlunos];
		
		for (int k = 0; k < numAlunos; k++) {
			System.out.println("Qual o nome do aluno [" + (k + 1) + "]");
			listaNomes[k] = leitor.nextLine();
			System.out.println("Qual a nota do aluno [" + (k + 1) + "]");
			listaNotas[k] = Double.parseDouble(leitor.nextLine());
		}
		
		double maiorNota = listaNotas[0];
		String nomeMaiorNota = listaNomes[0];
		for(int i = 0; i < listaNomes.length; i++) {
			if(listaNotas[i] > maiorNota) {
				maiorNota = listaNotas[i];
				nomeMaiorNota = listaNomes[i];
			}
		}
		
		int count = 0;
		int i = 0;
		while (i < listaNotas.length) {
			if(listaNotas[i] < 7) {
				count++;
			}
			i++;
		}
		
		System.out.printf("A maior nota é: %.2f do Aluno %s\n", maiorNota, nomeMaiorNota);
		System.out.printf("Quantidade de notas abaixo de 7 é %d\n", count);
		System.out.println("Fim do programa");
		
		leitor.close();
	}
}