package com.wossha.msbase.controllers.commands;

import java.io.IOException;

public interface ICommandSerializer {
    @SuppressWarnings("rawtypes")
	ICommand deserialize(String json) throws IOException;
}
