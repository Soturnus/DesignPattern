package criacionais.builder.diretor;

import criacionais.builder.builders.IBuilder;
import criacionais.builder.componentes.Motor;
import criacionais.builder.componentes.TipoCarro;
import criacionais.builder.componentes.Transmissao;

public class Diretor {
	
	/*
	 * Orquestrador
	 */
	
	public void contruirCarroSedan(IBuilder builder) {
		
		builder.setTipoCarro(TipoCarro.SEDAN);
		builder.setAssentos(5);
		builder.setTransmissao(Transmissao.AUTOMATICA);
		builder.setMotor(new Motor(1600));
		
	}
	
	public void contruirCaminhonete(IBuilder builder) {
		
		builder.setTipoCarro(TipoCarro.PICKUP);
		builder.setAssentos(5);
		builder.setTransmissao(Transmissao.AUTOMATICA_SEQUENCIAL);
		builder.setMotor(new Motor(13000));
		
	}

}
