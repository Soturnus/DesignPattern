package criacionais.abstractFactory.factories;

import criacionais.abstractFactory.transporteAereo.Helicoptero;
import criacionais.abstractFactory.transporteAereo.IVeiculoAereo;
import criacionais.abstractFactory.transporteTerrestre.IVeiculoTerrestre;
import criacionais.abstractFactory.transporteTerrestre.Moto;

public class InDriveTransporte implements ITransporteFactory {

	@Override
	public IVeiculoTerrestre criarTransporteTerrestre() {
		return new Moto();
	}

	@Override
	public IVeiculoAereo criarTransporteAereo() {
		return new Helicoptero();
	}
}
