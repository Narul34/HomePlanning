package com.adrien.model;

import java.util.Calendar;

public class Task {
	
	private String name;
	private TaskType tt;
	private String description;
	private Calendar date;
	private int timeLength;
	
	public Task(String name, TaskType tt, String description, Calendar date, int timeLength) {
		super();
		this.name = name;
		this.tt = tt;
		this.description = description;
		this.date = date;
		this.timeLength = timeLength;
	}

	public String getName() {
		return name;
	}

	public TaskType getTt() {
		return tt;
	}

	public String getDescription() {
		return description;
	}

	public Calendar getDate() {
		return date;
	}

	public int getTimeLength() {
		return timeLength;
	}
	
	
	

}
