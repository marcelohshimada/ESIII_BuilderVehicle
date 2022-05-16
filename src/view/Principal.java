package view;

import controller.MovimentacaoController;
import model.TipoVeiculo;
import model.Veiculo;
import model.VeiculoBuilder;

public class Principal {

	public static void main(String[] args) {
		
		MovimentacaoController mc = new MovimentacaoController();
		
//		Veiculo automovel = VeiculoBuilder.builder()
//				.addVeiculo(TipoVeiculo.AUTOMOVEL,"FAD-1234","GM","Corsa Hatch","Cinza",200)
//				.addQtdPortas(5)
//				.addAno(2012)
//				.get();
//		
//		Veiculo caminhao = VeiculoBuilder.builder()
//				.addVeiculo(TipoVeiculo.CAMINHAO, "GBQ-5678", "Mercedes-Benz", "710-Plus", "Vermelho", 160)
//				.addQtdEixos(4)
//				.addCargaMax(4000)
//				.get();
//		
//		Veiculo motocicleta = VeiculoBuilder.builder()
//				.addVeiculo(TipoVeiculo.MOTOCICLETA, "CML-4144", "Suzuki", "CG", "Amarelo", 180)
//				.addCilindradas(1000)
//				.get();
		
		Veiculo van = VeiculoBuilder.builder()
				.addVeiculo(TipoVeiculo.VAN, "FFA-6543", "Renault"	, "Master", "Branco", 160)
				.get();
		
		mc.inicioMovimentacao(van);
		mc.movimentacaoVeiculo();
	}
	
	

}
