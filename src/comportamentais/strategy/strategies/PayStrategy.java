package comportamentais.strategy.strategies;

/**
 * Interface comum entre todas as Strategies.
 */

public interface PayStrategy {
	
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
    
}
