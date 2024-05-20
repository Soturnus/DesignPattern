package criacionais.factoryMethod;

import criacionais.factoryMethod.veiculos.IVeiculo;

public abstract class Transporte {
	
	void iniciarTransporte() {		
		IVeiculo veiculo = criarTransporte();	
		veiculo.iniciarRota();
	
	}
	
	protected abstract IVeiculo criarTransporte();

}
