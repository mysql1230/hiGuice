package com.nokia.ci;

import com.google.inject.Inject;
import com.nokia.ci.itf.BillingService;
import com.nokia.ci.itf.CreditCard;
import com.nokia.ci.itf.CreditCardProcessor;
import com.nokia.ci.itf.PizzaOrder;
import com.nokia.ci.itf.Receipt;
import com.nokia.ci.itf.TransactionLog;

public class RealBillingService implements BillingService{
	private final CreditCardProcessor processor;
	private final TransactionLog transactionLog;

	@Inject
	RealBillingService(CreditCardProcessor processor,
			TransactionLog transactionLog) {
		this.processor = processor;
		this.transactionLog = transactionLog;
	}

	@Override
	public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
		this.processor.pay(100.0);
		this.transactionLog.write(" Hello!");
		System.out.println(RealBillingService.class.getName() + " called");
		return null;
	}
}
