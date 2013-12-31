package com.nokia.ci.impl;

import com.nokia.ci.itf.CreditCardProcessor;

public class AliPayCreditCardProcessor implements CreditCardProcessor{

	@Override
	public void pay(Double account) {
		System.out.println(AliPayCreditCardProcessor.class.getName() +" "+ account);		
	}

}
