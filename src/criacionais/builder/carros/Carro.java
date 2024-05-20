package criacionais.builder.carros;

import criacionais.builder.componentes.Motor;
import criacionais.builder.componentes.TipoCarro;
import criacionais.builder.componentes.Transmissao;

public class Carro {

	private final TipoCarro tipoCarro;
	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;
	
	public Carro(TipoCarro tipoCarro,
			int assentos,
			Motor motor,
			Transmissao transmissao) {
		
		this.tipoCarro = tipoCarro;
		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		
	}
	
	public TipoCarro getTipoCarro() {
		return tipoCarro;
	}

	public int getAssentos() {
		return assentos;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}
	
}
