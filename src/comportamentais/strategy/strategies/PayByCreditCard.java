package comportamentais.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Strategy concreto. Implementa o metodo de pagamento por cartão de credito
 */
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Coleta os dados do cartão
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Digite o numero do cartão: ");
            String number = READER.readLine();
            System.out.print("Digite a data de expiração do cartão 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Digite o CVV: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // valida as informações do cartão

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Após a validação podemos realizar a cobrança do cartão de credito do cliente
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Pagamento de " + paymentAmount + " realizado utilizando cartão de credito.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}