package com.nokia.ci.itf;

public interface BillingService {

	Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

}
