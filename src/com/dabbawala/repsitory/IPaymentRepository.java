package com.dabbawala.repsitory;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Payment;

public interface IPaymentRepository {

	
	public void makePayment(Payment payment) throws DatabaseOperationException,ApplicationException;
	
	
}
