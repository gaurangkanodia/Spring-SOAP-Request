package com.example.SoapDemo;

import java.util.List;

public class Accounts {
	
	long account_id;
	List<Long> external_id;
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public List<Long> getExternal_id() {
		return external_id;
	}
	public void setExternal_id(List<Long> external_id) {
		this.external_id = external_id;
	}

	
	
}
