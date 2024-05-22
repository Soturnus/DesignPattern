package comportamentais.strategy.order;

import comportamentais.strategy.strategies.IPayStrategy;

/**
 * Classe Order. Não sabe qual método de pagamento concreto (estratégia) o usuário escolheu.
 * la usa a interface comum de estratégia para delegar a coleta de dados de pagamento
 * ao objeto de estratégia. Pode ser usada para salvar o pedido no banco de dados.
 */
public class Order {
	
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(IPayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Aqui, poderíamos coletar e armazenar os dados de pagamento da estratégia.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}