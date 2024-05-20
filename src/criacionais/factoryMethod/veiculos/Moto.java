package criacionais.factoryMethod.veiculos;

public class Moto implements IVeiculo {

	@Override
	public void iniciarRota() {

		pegarPassageiros();
		System.out.println("Iniciando a entrega.");
		
	}

	@Override
	public void pegarPassageiros() {
		
		System.out.println("Ja pegamos o pacote para entrega.");
	}

}
