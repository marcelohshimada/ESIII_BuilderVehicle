package model;

public class Veiculo {

	private TipoVeiculo tipo;
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int velocidadeMax;
	private int qtdPortas;
	private int ano;
	private int qtdEixos;
	private int cargaMax;
	private int cilindradas;

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQtdEixos() {
		return qtdEixos;
	}

	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Veiculo " + "[tipo=" + tipo + ", placa=" + placa 
				+ ", marca=" + marca + ", modelo=" + modelo 
				+ ", cor=" + cor + ", velocidadeMax=" + velocidadeMax 
				+ ", qtdPortas=" + qtdPortas + ", ano=" + ano 
				+ ", qtdEixos=" + qtdEixos + ", cargaMax=" + cargaMax 
				+ ", cilindradas=" + cilindradas + "]\n";
	}

}
