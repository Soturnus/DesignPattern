package criacionais.builder.carros;

import criacionais.builder.componentes.Motor;
import criacionais.builder.componentes.TipoCarro;
import criacionais.builder.componentes.Transmissao;

public class Caminhonete {
	
//	private final TipoCarro tipoCarro;
//	private final int assentos;
	private final Motor motor;
	private final Transmissao transmissao;
	
	public Caminhonete(TipoCarro tipoCarro,
			int assentos,
			Motor motor,
			Transmissao transmissao) {
		
//		this.tipoCarro = tipoCarro;
//		this.assentos = assentos;
		this.motor = motor;
		this.transmissao = transmissao;
		
	}
	
	public String resultado() {
		String caminhonete = "Caminhonete com o motor: " + motor.getPotencia() + "\n";
		caminhonete += " e Transmissão: " + transmissao;
		
		return caminhonete;
		
	}

}
