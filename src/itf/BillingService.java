package itf;

public interface BillingService {

	Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

}
