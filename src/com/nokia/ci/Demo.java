package com.nokia.ci;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.nokia.ci.itf.CreditCard;
import com.nokia.ci.itf.PizzaOrder;

public class Demo {
	public static void main(String[] args) {
	    /*
	     * Guice.createInjector() takes your Modules, and returns a new Injector
	     * instance. Most applications will call this method exactly once, in their
	     * main() method.
	     */
	    Injector injector = Guice.createInjector(new BillingModule());

	    /*
	     * Now that we've got the injector, we can build objects.
	     */
	    RealBillingService billingService = injector.getInstance(RealBillingService.class);
	    CreditCard creditCard = null;
		PizzaOrder order = null;
		billingService.chargeOrder( order, creditCard);
		
		
		System.out.println("\n-------\n");
		
		Injector injector2 = Guice.createInjector(new AnotherBillingModule());
	    RealBillingService billingService2 = injector2.getInstance(RealBillingService.class);
	    CreditCard creditCard2 = null;
		PizzaOrder order2 = null;
		billingService2.chargeOrder( order2, creditCard2);
		
		
		
	  }
}
