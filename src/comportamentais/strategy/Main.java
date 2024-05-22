package comportamentais.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import comportamentais.strategy.order.Order;
import comportamentais.strategy.strategies.PayByCreditCard;
import comportamentais.strategy.strategies.PayByPayPal;
import comportamentais.strategy.strategies.IPayStrategy;

public class Main {
	
	 	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
	    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    private static Order order = new Order();
	    private static IPayStrategy strategy;

	    static {
	        priceOnProducts.put(1, 2200);
	        priceOnProducts.put(2, 1850);
	        priceOnProducts.put(3, 1100);
	        priceOnProducts.put(4, 890);
	    }

	    public static void main(String[] args) throws IOException {
	        while (!order.isClosed()) {
	            int cost;

	            String continueChoice;
	            do {
	            	
	                System.out.print("Selecione o produto:" + "\n" +
	                        "1 - Placa Mãe" + "\n" +
	                        "2 - CPU" + "\n" +
	                        "3 - HDD" + "\n" +
	                        "4 - Memória" + "\n");
	                
	                int choice = Integer.parseInt(reader.readLine());
	                cost = priceOnProducts.get(choice);
	                
	                System.out.print("Quantidade: ");
	                int count = Integer.parseInt(reader.readLine());
	                
	                order.setTotalCost(cost * count);
	                System.out.print("Deseja continuar selecionando produtos? S/N: ");
	                
	                continueChoice = reader.readLine();
	                
	            } while (continueChoice.equalsIgnoreCase("S"));

	            if (strategy == null) {
	            	
	                System.out.println("Selecione o metodo de pagamento:" + "\n" +
	                        "1 - PalPay" + "\n" +
	                        "2 - Cartão de Credito");
	                
	                String paymentMethod = reader.readLine();

		            // O cliente cria diferentes estratégias com base na entrada do usuário,
		            // configuração da aplicação, etc.
	                if (paymentMethod.equals("1")) {
	                    strategy = new PayByPayPal();
	                } else {
	                    strategy = new PayByCreditCard();
	                }
	            }

	            // O objeto Order delega a coleta de dados de pagamento ao objeto de estratégia,
	            // já que apenas as estratégias sabem quais dados precisam para processar um pagamento.
	            order.processOrder(strategy);

	            System.out.print("Pagar " + order.getTotalCost() + " reais ou Continuar comprando? (P)pagar/(C)continuar: ");
	            String proceed = reader.readLine();
	            if (proceed.equalsIgnoreCase("P")) {
	            	// Finalmente, a estratégia lida com o pagamento.
	                if (strategy.pay(order.getTotalCost())) {
	                    System.out.println("Pagamento concluido com sucesso!.");
	                } else {
	                    System.out.println("FALHA! por favor, verifique seus dados.");
	                }
	                order.setClosed();
	            }
	        }
	    }

}
