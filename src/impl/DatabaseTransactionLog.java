package impl;

import itf.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog{

	@Override
	public void write(String message) {
		System.out.println(DatabaseTransactionLog.class.getName() +" "+ message);
	}

}
