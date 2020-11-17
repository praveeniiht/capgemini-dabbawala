package com.dabbawala.repsitory;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Complaint;

public interface IComplaintRepository {

	public void raiseComplain(Complaint complaint) throws DatabaseOperationException,ApplicationException;
	
	public void solveComplain(Complaint complaint) throws DatabaseOperationException,ApplicationException;
	
	public List<Complaint> seeAllComplaint() throws DatabaseOperationException,ApplicationException;
	
	
}
