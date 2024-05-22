package comportamentais.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Strategy Concreto. implementa o metodo de pagamento PayPal.
 */
public class PayByPayPal implements IPayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("12345", "rivaldo@gmail.com");
        DATA_BASE.put("designPattern", "designpattern@gmail.com");
    }

    /**
     * Coleta os dados do usuario
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Digite o email: ");
                email = READER.readLine();
                System.out.print("Digite a senha: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Dados verificados com sucesso.");
                } else {
                    System.out.println("Email ou senha incorretos!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * Armazena os dados do cliente para futuras tentativas
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Pagamento de " + paymentAmount + " utilizando PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
