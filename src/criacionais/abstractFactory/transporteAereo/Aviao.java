package criacionais.abstractFactory.transporteAereo;

public class Aviao implements IVeiculoAereo {

	@Override
	public void iniciarRota() {
		vento();
		pegarCarga();
		System.out.println("Iniciando a decolagem");
	}

	@Override
	public void pegarCarga() {
		System.out.println("Passageiros a bordo, Vôo autorizado.");	
	}

	@Override
	public void vento() {
		System.out.println("Ventos a 25km/h, ventos ok!");
	}

}
