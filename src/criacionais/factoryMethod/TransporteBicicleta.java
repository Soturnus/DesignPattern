package criacionais.factoryMethod;

import criacionais.factoryMethod.veiculos.Bicicleta;
import criacionais.factoryMethod.veiculos.IVeiculo;

public class TransporteBicicleta extends Transporte {

	@Override
	protected IVeiculo criarTransporte() {
		return new Bicicleta();
	}

	
}
