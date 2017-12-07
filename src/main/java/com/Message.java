package com;

import java.util.ArrayList;
import java.util.List;

public class Message {

	public List<String> getEvents() {
		return events;
	}

	List<String> events = new ArrayList<String>();
	
	public String kwak() {
		events.add("MessageQuacked");
		return "MessageQuacked";
	}

	public String delete() {
		if("MessageDeleted".equals(getEvents().get(getEvents().size()-1))) {
			return "";
		}
		events.add("MessageDeleted");
		return "MessageDeleted";
	}

}
