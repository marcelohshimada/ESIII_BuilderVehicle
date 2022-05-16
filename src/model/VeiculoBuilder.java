package model;

public class VeiculoBuilder {

	private Veiculo veiculo;

	public VeiculoBuilder() {
		this.veiculo = new Veiculo();
	}

	public static VeiculoBuilder builder() {
		return new VeiculoBuilder();
	}

	public VeiculoBuilder addVeiculo(TipoVeiculo tipo, String placa, String marca, String modelo, String cor,
			int velocidadeMax) {

		veiculo.setTipo(tipo);
		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setCor(cor);
		veiculo.setVelocidadeMax(velocidadeMax);
		return this;
	}

	public VeiculoBuilder addQtdPortas(int qtdPortas) {
		veiculo.setQtdPortas(qtdPortas);
		return this;
	}

	public VeiculoBuilder addAno(int ano) {
		veiculo.setAno(ano);
		return this;
	}

	public VeiculoBuilder addQtdEixos(int qtdEixos) {
		veiculo.setQtdEixos(qtdEixos);
		return this;
	}

	public VeiculoBuilder addCargaMax(int cargaMax) {
		veiculo.setCargaMax(cargaMax);
		return this;
	}

	public VeiculoBuilder addCilindradas(int cilindradas) {
		veiculo.setCilindradas(cilindradas);
		return this;
	}

	public Veiculo get() {
		return this.veiculo;
	}

}
