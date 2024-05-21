package estruturais.adapter.paypal;

import estruturais.adapter.utils.Token;

public class Paypal implements IPagamentoPaypal {
	
	private Token token;

	@Override
	public Token authToken() {
		
		return new Token();
	}

	@Override
	public void pagarPaypal() {
		this.token = authToken();
		System.out.println("Enviando pagamento utilizando Paypal");
		
	}

	@Override
	public void receberPaypal() {
		System.out.println("Recebendo pagamento utilizando Paypal");
		
	}

	public Token getToken() {
		return token;
	}

}
