package estagio2;

import java.util.ArrayList;

public class TestaSisEleicoesArray {
	public static void main(String[] args) {
		SisEleicoesArray sisEleicoes = new SisEleicoesArray();

		sisEleicoes.cadastrarVoto("José da Silva", "111", 88);

		/* a) */ sisEleicoes.cadastrarVoto("Lucas Pereira", "222", 12);

		/* b) */ if (sisEleicoes.eleitorVotou("222")) {
			System.out.println("Voto cadastrado com sucesso.");
		} else {
			System.out.println("Problema na votação.");
		}

		/* c) */ int quantVotosCandidato = sisEleicoes.contarQuantidadeDeVotosParaCandidato(99);

		System.out.println("O candidato de número 99, Quantidade de votos: " + quantVotosCandidato);

	}
}