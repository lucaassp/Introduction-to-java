package exercicio09;

import java.util.ArrayList;
import java.util.List;

public class Titureco {
	private List<AtrativoTuristico> atrativos;
	

	public Titureco() {
	}

	public Titureco(List<AtrativoTuristico> atrativo) {
		this.atrativos = new ArrayList<AtrativoTuristico>();
	}

	public boolean existeAtrativo(AtrativoTuristico atrativo) {
		for (AtrativoTuristico at : this.atrativos) {
			if (at.equals(atrativo)) {
				return true;
			}
		}
		return false;
	}
	
	public List<AtrativoTuristico> pesquisarAtrativosTuristicosDaCidade(String cidade, String estado){
		List<AtrativoTuristico> lista = new ArrayList<AtrativoTuristico>();
		for (AtrativoTuristico at : this.atrativos) {
			if(at.getCidade().equals(cidade) && at.getEstado().equals(estado)) {
				lista.add(at);
			}
		}
		return lista;
	}

	public boolean apagarAtrativo(String nome, String cidade, String estado) {
		AtrativoTuristico at = new AtrativoTuristico(nome, 0.0, 0.0, "", cidade, estado);
		return this.atrativos.remove(at);
	}

	public AtrativoTuristico cadastraERetornaAtativo(String nome, String cidade, String estado) {
		AtrativoTuristico at = new AtrativoTuristico(nome, 0.0, 0.0, "", cidade, estado);

		for (AtrativoTuristico atrativo : this.atrativos) {
			if (atrativo.equals(at)) {
				return atrativo;
			}
		}
		this.atrativos.add(at);
		return at;
	}

	public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
		if (existeAtrativo(atrativo)) {
			return false;
		} else {
			this.atrativos.add(atrativo);
			return true;
		}
	}

	public List<AtrativoTuristico> getAtrativos() {
		return atrativos;
	}

	public void setAtrativos(List<AtrativoTuristico> atrativos) {
		this.atrativos = atrativos;
	}
	
}
