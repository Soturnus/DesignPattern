package criacionais.abstractFactory.transporteAereo;

public class Helicoptero implements IVeiculoAereo {

	@Override
	public void iniciarRota() {
		vento();
		pegarCarga();
		System.out.println("Iniciando decolagem");
		
	}

	@Override
	public void pegarCarga() {
		System.out.println("Passageiros a bordo, Ligando hélices");
		
	}

	@Override
	public void vento() {
		System.out.println("Ventos a 30km, condição favoravel, ventos ok!");
		
	}

}
