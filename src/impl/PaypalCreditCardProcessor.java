package impl;

import itf.CreditCardProcessor;

public class PaypalCreditCardProcessor implements CreditCardProcessor{

	@Override
	public void pay(Double account) {
		System.out.println(PaypalCreditCardProcessor.class.getName() +" "+ account);		
	}

}
