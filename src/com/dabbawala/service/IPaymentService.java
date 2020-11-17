package com.dabbawala.service;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Payment;

public interface IPaymentService {

	public void makePayment(Payment payment) throws DatabaseOperationException,ApplicationException;
}
