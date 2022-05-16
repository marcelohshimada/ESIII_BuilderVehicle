package controller;

import model.TipoVeiculo;
import model.Veiculo;

public class MovimentacaoController {
	Veiculo veiculo;

	public void inicioMovimentacao(Veiculo veiculo) {
		System.out.println("O veículo iniciou a movimentação\n");
		System.out.println(veiculo);

		this.veiculo = veiculo;
	}

	public void movimentacaoVeiculo() {
		if (this.veiculo.getTipo().equals(TipoVeiculo.AUTOMOVEL)) {
			automovel();
		} else if (this.veiculo.getTipo().equals(TipoVeiculo.CAMINHAO)) {
			caminhao();
		} else if (this.veiculo.getTipo().equals(TipoVeiculo.MOTOCICLETA)) {
			motocicleta();
		} else if (this.veiculo.getTipo().equals(TipoVeiculo.VAN)) {
			van();
		}
	}

	private double gerarNumeroAleatorio(double min, double max) {
		double random;
		random = (Math.random() * (max - min)) + min;
		return random;
	}
	
	private void automovel() {

		double segundos = gerarNumeroAleatorio(10, 30);
		double deslocamento = gerarNumeroAleatorio(50, 650);
		double passageiros = gerarNumeroAleatorio(1, 4);

		System.out.println("Tempo para atingir 100km/h: " + segundos);
		System.out.println("Deslocamento total : " + deslocamento + "km");
		System.out.println("Quantidade de passageiros: " + passageiros);

	}

	private void caminhao() {

		double carga = gerarNumeroAleatorio(1000, 3000);
		double deslocamento = gerarNumeroAleatorio(500, 3000);
		double valor = gerarNumeroAleatorio(2000, 5000);

		System.out.println("Carga do caminhão: " + carga + " kg");
		System.out.println("Deslocamento total : " + deslocamento + "km");
		System.out.println("Valor do frete R$ " + valor);

	}

	private void motocicleta() {

		double deslocamento = gerarNumeroAleatorio(20, 100);
		double valor = gerarNumeroAleatorio(30, 80);

		System.out.println("Deslocamento total : " + deslocamento + "km");
		System.out.println("Valor do frete R$ " + valor);

	}

	private void van() {

		double passageiros = gerarNumeroAleatorio(3, 12);
		double paradas = gerarNumeroAleatorio(3, 12);
		
		System.out.println("Quantidade de passageiros: " + passageiros);
		System.out.println("Quantidade de paradas: " + paradas);
	
	}

}
