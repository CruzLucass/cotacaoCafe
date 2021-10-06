package cotacaoCafe.context;

public abstract class Cafe {
	
	private String nome;
	private String tipoPlantio;
	private String tipoBebida;
	private double pesoSaca;
	
	public Cafe() {	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPlantio() {
		return tipoPlantio;
	}

	public void setTipoPlantio(String tipoPlantio) {
		this.tipoPlantio = tipoPlantio;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public double getPesoSaca() {
		return pesoSaca;
	}

	public void setPesoSaca(double pesoSaca) {
		this.pesoSaca = pesoSaca;
	}

	public abstract double getValorAtualizado();

	public abstract double getValorAtual();
	
	
}
