package ci;

import itf.BillingService;
import itf.CreditCard;
import itf.CreditCardProcessor;
import itf.PizzaOrder;
import itf.Receipt;
import itf.TransactionLog;

import com.google.inject.Inject;

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
