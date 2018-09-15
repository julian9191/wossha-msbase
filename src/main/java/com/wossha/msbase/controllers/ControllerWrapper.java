package com.wossha.msbase.controllers;

import java.util.HashMap;

public class ControllerWrapper {
	
	public HashMap<String, String> wrapMessaje(String msj) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("msj", msj);
        return map;
    }
	
}
