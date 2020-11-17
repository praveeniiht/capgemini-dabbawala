package com.dabbawala.repsitory;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.User;

public interface IUserRepository {

	public void registerUser(User user) throws DatabaseOperationException,ApplicationException;
	
	public List<User> getAllUser() throws DatabaseOperationException,ApplicationException;
}
