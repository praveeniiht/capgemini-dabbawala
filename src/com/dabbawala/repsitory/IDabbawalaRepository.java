package com.dabbawala.repsitory;

import java.util.Date;
import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Dabbawala;

public interface IDabbawalaRepository {

	public void addDabbawala(Dabbawala dabbawala) throws DatabaseOperationException,ApplicationException;
	
	public void updateDabbawala(Dabbawala dabbawala) throws DatabaseOperationException,ApplicationException;
	
	public void deleteDabbawala(int dabbawalaId) throws DatabaseOperationException,ApplicationException;
	
	public List<Dabbawala> getAllDabbawala() throws DatabaseOperationException,ApplicationException;
	
	public Dabbawala getDabbawalaByLocation(String location) throws DatabaseOperationException,ApplicationException;
	
		
		
}
