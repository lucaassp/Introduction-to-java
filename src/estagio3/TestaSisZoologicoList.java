package estagio3;

import java.util.LinkedList;
import java.util.List;

public class TestaSisZoologicoList {
	public static void main(String[] args) {
		SisZoologico siszoo = new SisZoologicoList(new LinkedList<Animal>());
		try {
			siszoo.cadastraAnimal(new Mamifero("x45p", "Gato", 6, 3));
			System.out.println("[CADASTRADO]");
			siszoo.cadastraAnimal(new Mamifero("B56","Baleia", 5, 7));
			System.out.println("[CADASTRADO]");
			
			boolean existeAnimal = siszoo.existeAnimal("B56");
			if (existeAnimal) {
			  System.out.println(">>MAMÍFERO EXISTE<<<");
			} else {
			  System.out.println(">>>MAMÍFERO NÃO EXISTE<<<");
			}
			
			List<Animal> pesquisaAnimal = siszoo.pesquisaAnimaisComIdadeMaiorQue(3);
			for (Animal animal: pesquisaAnimal) {
			  System.out.println("ANIMAL: " + animal.getNome());
			}
		} catch (AnimalJaExisteException e) {
			System.out.println("[EXISTE ANIMAL]");
			e.printStackTrace();
		}
		
		
	}
}
