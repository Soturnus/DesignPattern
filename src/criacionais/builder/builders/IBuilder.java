package criacionais.builder.builders;

import criacionais.builder.componentes.Motor;
import criacionais.builder.componentes.TipoCarro;
import criacionais.builder.componentes.Transmissao;

public interface IBuilder {
	
	void setTipoCarro(TipoCarro tipo);
	void setAssentos(int assentos);
	void setTransmissao(Transmissao transmissao);
	void setMotor(Motor motor);

}
