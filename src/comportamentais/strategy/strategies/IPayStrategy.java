package comportamentais.strategy.strategies;

/**
 * Interface comum entre todas as Strategies.
 */

public interface IPayStrategy {
	
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
    
}
