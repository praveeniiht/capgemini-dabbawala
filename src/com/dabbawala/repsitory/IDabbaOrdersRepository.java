package com.dabbawala.repsitory;

import java.util.Date;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.DabbaOrders;
import com.dabbawala.model.User;

public interface IDabbaOrdersRepository {

	public void placeDabbaOrder(DabbaOrders dabbaOrder) throws DatabaseOperationException,ApplicationException;
	
	public void cancelDabbaOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public void deliverDabbaOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public DabbaOrders viewOrder(User userId) throws DatabaseOperationException,ApplicationException;
	
	}
