package com.wossha.msbase.commands;

import java.util.ArrayList;
import java.util.List;
import com.wossha.json.events.events.api.Event;


public class CommandResult {
	
	private String message;
	private List<Event> events;
	
	public CommandResult(String message, List<Event> events) {
		this.message = message;
		this.events = events;
	}
	
	public CommandResult(String message) {
		this.message = message;
		this.events = new ArrayList<Event>();
	}
	
	public CommandResult() {
		this.events = new ArrayList<Event>();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void addEvent(Event event) {
		events.add(event);
		
	}

}
