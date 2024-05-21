package estruturais.adapter;

import estruturais.adapter.paypal.IPagamentoPaypal;
import estruturais.adapter.paypal.Paypal;

public class Main {

	public static void main(String[] args) {

		IPagamentoPaypal pagamento = new Paypal();
		pagamento.pagarPaypal();
		pagamento.receberPaypal();
		
//		IPagamentoPaypal pagamento = new VisaAdapter(new Visa());
//		pagamento.pagarPaypal();
//		pagamento.receberPaypal();

	}

}
