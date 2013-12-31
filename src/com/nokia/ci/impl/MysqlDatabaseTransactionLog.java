package com.nokia.ci.impl;


public class MysqlDatabaseTransactionLog extends DatabaseTransactionLog{

	@Override
	public void write(String message) {
		System.out.println(MysqlDatabaseTransactionLog.class.getName() +" "+ message);
	}

}
