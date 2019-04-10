package com.wossha.msbase.controllers;

import java.util.HashMap;

public class ControllerWrapper {
	
	public HashMap<String, Object> wrapMessaje(String msj, Object response) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("msj", msj);
        map.put("response", response);
        return map;
    }
	
}
