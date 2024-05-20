package criacionais.abstractFactory.transporteTerrestre;

public class Moto implements IVeiculoTerrestre {
	
	@Override
	public void iniciarRota() {
		pegarCarga();
		System.out.println("Iniciando a entrega");	
	}

	@Override
	public void pegarCarga() {
		System.out.println("Já pegamos a encomenda");
	}

}
