package estruturais.adapter.visa;

import estruturais.adapter.utils.Token;

public interface IPagamentoVisa {

	Token authToken();
	void pagarVisa();
	void receberVisa();
	
}
