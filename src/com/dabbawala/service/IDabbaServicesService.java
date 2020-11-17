package com.dabbawala.service;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.DabbaServices;

public interface IDabbaServicesService {

public void createDabbaService(DabbaServices dabbaServices) throws DatabaseOperationException,ApplicationException;
	
	public void updateDabbaService(DabbaServices dabbaServices) throws DatabaseOperationException,ApplicationException;
	
	public void deleteDabbaService(int serviceId) throws DatabaseOperationException,ApplicationException;
	
	public List<DabbaServices> getAllDabbaServices() throws DatabaseOperationException,ApplicationException;
}
