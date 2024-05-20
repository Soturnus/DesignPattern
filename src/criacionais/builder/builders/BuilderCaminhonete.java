package criacionais.builder.builders;

import criacionais.builder.carros.Caminhonete;
import criacionais.builder.componentes.Motor;
import criacionais.builder.componentes.TipoCarro;
import criacionais.builder.componentes.Transmissao;

public class BuilderCaminhonete implements IBuilder {

	private TipoCarro tipoCarro;
	private int assentos;
	private Motor motor;
	private Transmissao transmissao;
	
	@Override
	public void setTipoCarro(TipoCarro tipoCarro) {
		this.tipoCarro = tipoCarro;	
	}

	@Override
	public void setAssentos(int assentos) {
		this.assentos = assentos;
		
	}

	@Override
	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
		
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;
		
	}
	
	public Caminhonete getResultado() {
		return new Caminhonete(tipoCarro, assentos, motor, transmissao);
	}

}
