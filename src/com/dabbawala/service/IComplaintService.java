package com.dabbawala.service;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.Complaint;

public interface IComplaintService {

	public void raiseComplaint(Complaint complaint) throws DatabaseOperationException,ApplicationException;
	
	public void solveComplaint(Complaint complaint) throws DatabaseOperationException,ApplicationException;
	
	public List<Complaint> displayAllComplaints() throws DatabaseOperationException,ApplicationException;
}
