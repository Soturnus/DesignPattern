package criacionais.factoryMethod;

import criacionais.factoryMethod.veiculos.IVeiculo;
import criacionais.factoryMethod.veiculos.Moto;

public class TransporteMoto extends Transporte {

	@Override
	protected IVeiculo criarTransporte() {	
		return new Moto();
	}

}
