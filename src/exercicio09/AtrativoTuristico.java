package exercicio09;

public class AtrativoTuristico {
	private String nome;
	private double latitude;
	private double longitude;
	private String comoChegar;
	private String cidade;
	private String estado;
	
	public AtrativoTuristico() {
		this("", 0.0, 0.0, "", "", "");
	}

	public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade,
			String estado) {
		super();
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.comoChegar = comoChegar;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCoordenadas(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getComoChegar() {
		return comoChegar;
	}

	public void setComoChegar(String comoChegar) {
		this.comoChegar = comoChegar;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "AtrativoTuristico [nome=" + nome + 
				", latitude=" + latitude + 
				", longitude=" + longitude + 
				", comoChegar=" + comoChegar + 
				", cidade=" + cidade + 
				", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtrativoTuristico other = (AtrativoTuristico) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
