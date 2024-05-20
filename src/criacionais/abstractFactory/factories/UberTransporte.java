package criacionais.abstractFactory.factories;

import criacionais.abstractFactory.transporteAereo.Aviao;
import criacionais.abstractFactory.transporteAereo.IVeiculoAereo;
import criacionais.abstractFactory.transporteTerrestre.Carro;
import criacionais.abstractFactory.transporteTerrestre.IVeiculoTerrestre;

public class UberTransporte implements ITransporteFactory {

	@Override
	public IVeiculoTerrestre criarTransporteTerrestre() {
		return new Carro();
	}

	@Override
	public IVeiculoAereo criarTransporteAereo() {
		return new Aviao();
	}

}
