package estruturais.adapter.paypal;

import estruturais.adapter.utils.Token;

public interface IPagamentoPaypal {
	
	Token authToken();
	void pagarPaypal();
	void receberPaypal();

}
