package impl;

import itf.CreditCardProcessor;

public class AliPayCreditCardProcessor implements CreditCardProcessor{

	@Override
	public void pay(Double account) {
		System.out.println(AliPayCreditCardProcessor.class.getName() +" "+ account);		
	}

}
