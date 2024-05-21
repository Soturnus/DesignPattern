package estruturais.adapter.adapter;

import estruturais.adapter.paypal.IPagamentoPaypal;
import estruturais.adapter.utils.Token;
import estruturais.adapter.visa.Visa;

public class VisaAdapter implements IPagamentoPaypal {
	
	private Token token;
	private Visa visa;
	
	public VisaAdapter(Visa visa) {
		this.visa = visa;
		System.out.println("Adaptando os metodos do Paypal para serem utilizados pelo Visa.");
	}
	

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void pagarPaypal() {
		this.visa.pagarVisa();
		
	}

	@Override
	public void receberPaypal() {
		this.visa.receberVisa();
	}


	public Token getToken() {
		return token;
	}

}
