package com.nokia.ci;

import com.google.inject.AbstractModule;
import com.nokia.ci.impl.DatabaseTransactionLog;
import com.nokia.ci.impl.PaypalCreditCardProcessor;
import com.nokia.ci.itf.CreditCardProcessor;
import com.nokia.ci.itf.TransactionLog;

public class BillingModule extends AbstractModule {
	  @Override 
	  protected void configure() {

	     /*
	      * This tells Guice that whenever it sees a dependency on a TransactionLog,
	      * it should satisfy the dependency using a DatabaseTransactionLog.
	      */
	    bind(TransactionLog.class).to(DatabaseTransactionLog.class);

	     /*
	      * Similarly, this binding tells Guice that when CreditCardProcessor is used in
	      * a dependency, that should be satisfied with a PaypalCreditCardProcessor.
	      */
	    bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
	  }
	}
