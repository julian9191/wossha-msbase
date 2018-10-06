package com.wossha.msbase.commands;

import com.wossha.msbase.exceptions.BusinessException;
import com.wossha.msbase.exceptions.TechnicalException;

public interface ICommand<T> {
	public String commandName();
    public T data();
    public void setData(T data);
    public void setUsername(String username); 
    public CommandResult execute() throws BusinessException, TechnicalException;
}
