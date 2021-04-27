package estagio3;

import java.util.LinkedList;
import java.util.List;

public class SisZoologicoList implements SisZoologico {

	private List<Animal> animais;

	public SisZoologicoList(List<Animal> animais) {
		this.animais = animais;
	}

	@Override
	public void cadastraAnimal(Animal a) throws AnimalJaExisteException {
		if (existeAnimal(a.getCodigo())) {
			throw new AnimalJaExisteException("Já existe animal com esse código");

		} else {
			this.animais.add(a);
		}
	}

	@Override
	public List<Animal> pesquisaAnimaisComIdadeMaiorQue(int idade) {
		List<Animal> animaisIdadeMaior = new LinkedList<Animal>();

		for (Animal animal : this.animais) {
			if (animal.getIdade() > idade) {
				animaisIdadeMaior.add(animal);
			}
		}
		return animaisIdadeMaior;
	}

	@Override
	public Animal pesquisaAnimal(String codigo) throws AnimalNaoExisteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeAnimal(String codigoAnimal) {
		for (Animal animal : this.animais) {
			if (animal.getCodigo().equals(codigoAnimal)) {
				return true;
			}
		}
		return false;
	}
}
//...
