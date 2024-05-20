package criacionais.abstractFactory.factories;

import criacionais.abstractFactory.transporteAereo.IVeiculoAereo;
import criacionais.abstractFactory.transporteTerrestre.IVeiculoTerrestre;

public interface ITransporteFactory {
	
	IVeiculoTerrestre criarTransporteTerrestre();
	IVeiculoAereo criarTransporteAereo();

}
