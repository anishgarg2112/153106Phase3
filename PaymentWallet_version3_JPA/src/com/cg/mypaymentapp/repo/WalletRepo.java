package com.cg.mypaymentapp.repo;

import com.cg.mypaymentapp.beans.Customer;

public interface WalletRepo {

	public boolean save(Customer customer);

	public Customer findOne(String mobileNo);
	
	public boolean update(Customer customer);

	public void startTransaction();

	public void commitTransaction();


}
