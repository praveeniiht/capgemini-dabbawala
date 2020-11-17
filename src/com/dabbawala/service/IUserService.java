package com.dabbawala.service;

import java.util.List;

import com.dabbawala.exceptions.ApplicationException;
import com.dabbawala.exceptions.DatabaseOperationException;
import com.dabbawala.model.User;

public interface IUserService {

	public void registerUser(User user) throws DatabaseOperationException,ApplicationException;

	public boolean validateUser(User user) throws DatabaseOperationException,ApplicationException;
}
