package com.spring.legacy;

import java.util.UUID;

public class ObjectC {

	private String id;	
	private ObjectC1 ObjectC1;
	 
	public ObjectC(String id, ObjectC1 ObjectC1) {
		super();
		this.id = id;
		this.ObjectC1 = ObjectC1;
	}

	@Override
	public String toString() {
		return "ObjectC [id=" + id + ", ObjectC1=" + ObjectC1 + "]";
	}




}
