package com.dabbawala.repsitory;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Catering;

public interface ICateringRepository {

	public void addCatering(Catering catering) throws DatabaseOperationException,ApplicationException;
	
	public void updateCatering(Catering catering) throws DatabaseOperationException,ApplicationException;
	
	public void deleteCatering(int catererId) throws DatabaseOperationException,ApplicationException;
	
	public List<Catering> getAllCatering() throws DatabaseOperationException,ApplicationException;
	
	public Catering getCateringByLocation(String location) throws DatabaseOperationException,ApplicationException;
	
			
}
