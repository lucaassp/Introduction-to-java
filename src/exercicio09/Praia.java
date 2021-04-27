package exercicio09;

public class Praia extends AtrativoTuristico {
	  
	  private boolean propriaParaBanho;
	  private boolean perigoTubarao;
	  private String tipoOrla;
	  
	  public static final String TIPO_PISCINA_NATURAL = "Piscinas naturais";
	  public static final String TIPO_ONDAS_FORTES = "Ondas fortes";
	  public static final String TIPO_ONDAS_MEDIAS = "Ondas médias";
	  
	  public Praia() {
	    this("", 0.0, 0.0, "", "", "", true, false, "");
	  }
	  
	  public Praia(
	    String nome,
	    double latitude,
	    double longitude,
	    String comoChegar,
	    String cidade,
	    String estado,
	    boolean propriaParaBanho,
	    boolean perigoTubarao,
	    String tipoOrla
	  ) {
	    this.setNome(nome);
		this.setLatitude(latitude);
	    this.setLatitude(longitude);
	    this.setComoChegar(comoChegar);
	    this.setCidade(cidade);
	    this.setEstado(estado);
	    this.propriaParaBanho = propriaParaBanho;
	    this.perigoTubarao = perigoTubarao;
	    this.tipoOrla = tipoOrla;
	  }

	  private void setLatitude(double latitude) {
		// TODO Auto-generated method stub
		
	  }

	  public boolean ehPropriaParaBanho() {
	    return propriaParaBanho;
	  }

	  public void setPropriaParaBanho(boolean propriaParaBanho) {
	    this.propriaParaBanho = propriaParaBanho;
	  }

	  public boolean temPerigoTubarao() {
	    return perigoTubarao;
	  }

	  public void setPerigoTubarao(boolean perigoTubarao) {
	    this.perigoTubarao = perigoTubarao;
	  }

	  public String getTipoOrla() {
	    return tipoOrla;
	  }

	  public void setTipoOrla(String tipoOrla) {
	    this.tipoOrla = tipoOrla;
	  }
	}