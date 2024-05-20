package criacionais.factoryMethod.veiculos;

public class Bicicleta implements IVeiculo {

	@Override
	public void iniciarRota() {
		
		pegarPassageiros();
		System.out.println("Iniciando o Delivery");
		
	}

	@Override
	public void pegarPassageiros() {
		
		System.out.println("Já pegamos a comida");
		
	}

}
