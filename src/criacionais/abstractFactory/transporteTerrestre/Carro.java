package criacionais.abstractFactory.transporteTerrestre;

public class Carro implements IVeiculoTerrestre {

	@Override
	public void iniciarRota() {
		pegarCarga();
		System.out.println("Iniciando o trajeto");	
	}

	@Override
	public void pegarCarga() {
		System.out.println("Pegamos os passageiros, estamos prontos");
	}
}
