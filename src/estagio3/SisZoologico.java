package estagio3;

import java.util.List;

public interface SisZoologico {
	public void cadastraAnimal(Animal a) throws AnimalJaExisteException;

	public List<Animal> pesquisaAnimaisComIdadeMaiorQue(int idade);

	public Animal pesquisaAnimal(String codigo) throws AnimalNaoExisteException;

	public boolean existeAnimal(String codigoAnimal);
}
