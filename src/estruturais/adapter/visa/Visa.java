package estruturais.adapter.visa;

import estruturais.adapter.utils.Token;

public class Visa implements IPagamentoVisa {

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void pagarVisa() {
		System.out.println("Enviando pagamento utilizando Visa");
		
	}

	@Override
	public void receberVisa() {
		System.out.println("Recebendo pagamento utilizando Visa");		
	}

}
