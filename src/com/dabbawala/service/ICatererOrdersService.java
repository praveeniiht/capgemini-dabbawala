package com.dabbawala.service;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.CatererOrders;
import com.dabbawala.model.User;

public interface ICatererOrdersService {

	public void placeCateringOrder(CatererOrders catererOrders) throws DatabaseOperationException,ApplicationException;
	
	public void cancelCateringOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public void deliverCateringOrder(int orderId) throws DatabaseOperationException,ApplicationException;
	
	public CatererOrders viewOrder(User userId) throws DatabaseOperationException,ApplicationException;
}
