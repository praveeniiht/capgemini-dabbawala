package com.dabbawala.service;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.DabbaOrders;
import com.dabbawala.model.User;

public interface IDabbaOrdersService {

public void placeDabbaOrder(DabbaOrders dabbaOrder) throws DatabaseOperationException,ApplicationException;
	
	public void cancelDabbaOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public void deliverDabbaOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public DabbaOrders viewOrder(User userId) throws DatabaseOperationException,ApplicationException;
}
