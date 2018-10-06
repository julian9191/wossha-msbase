package com.wossha.msbase.commands;

import java.io.IOException;

public interface ICommandSerializer {
    @SuppressWarnings("rawtypes")
	ICommand deserialize(String json) throws IOException;
}
