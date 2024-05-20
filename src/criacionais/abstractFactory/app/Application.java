package criacionais.abstractFactory.app;

import criacionais.abstractFactory.factories.ITransporteFactory;
import criacionais.abstractFactory.transporteAereo.IVeiculoAereo;
import criacionais.abstractFactory.transporteTerrestre.IVeiculoTerrestre;

public class Application {
	
	private IVeiculoTerrestre veiculoTerrestre;
	private IVeiculoAereo veiculoAereo;
	
	public Application(ITransporteFactory factory) {
		veiculoTerrestre = factory.criarTransporteTerrestre();
		veiculoAereo = factory.criarTransporteAereo();
	}
	
	public void iniciarRota() {
		veiculoTerrestre.iniciarRota();
		veiculoAereo.iniciarRota();
	}

}
