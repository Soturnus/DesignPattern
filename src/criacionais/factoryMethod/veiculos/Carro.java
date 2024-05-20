package criacionais.factoryMethod.veiculos;

public class Carro implements IVeiculo {

	@Override
	public void iniciarRota() {
		pegarPassageiros();
		System.out.println("Iniciando o trajeto.");
		
	}

	@Override
	public void pegarPassageiros() {
		System.out.println("Pegamos os passageiros, estamos prontos.");
		
	}

}
