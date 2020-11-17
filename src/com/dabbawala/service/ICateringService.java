package com.dabbawala.service;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Catering;

public interface ICateringService {

	public void addCaterer(Catering catering) throws DatabaseOperationException,ApplicationException;
	
	public void updateCaterer(Catering catering) throws DatabaseOperationException,ApplicationException;
	
	public void deleteCaterer(int catererId) throws DatabaseOperationException,ApplicationException;
	
	public List<Catering> getAllCaterers() throws DatabaseOperationException,ApplicationException;
	
	public Catering getCatererByLocation(String location) throws DatabaseOperationException,ApplicationException;
	
	
}
