package criacionais.factoryMethod;

import criacionais.factoryMethod.veiculos.Carro;
import criacionais.factoryMethod.veiculos.IVeiculo;

public class TransporteCarro extends Transporte {

	@Override
	protected IVeiculo criarTransporte() {	
		return new Carro();
	}

}
