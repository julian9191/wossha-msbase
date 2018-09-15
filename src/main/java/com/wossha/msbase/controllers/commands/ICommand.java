package com.wossha.msbase.controllers.commands;

import com.wossha.msbase.exceptions.BusinessException;
import com.wossha.msbase.exceptions.TechnicalException;

public interface ICommand<T> {
	public String commandName();
    public T data();
    public void setData(T data);
    public void setUser(String username); 
    public String execute() throws BusinessException, TechnicalException;
}
