package com.wossha.msbase.services;

import java.util.UUID;
import com.fasterxml.uuid.Generators;

public class UUIDGenerator {
	
	public static String generateUUID() {
		UUID uuid = Generators.timeBasedGenerator().generate();
		return uuid.toString();
	}
	
}
