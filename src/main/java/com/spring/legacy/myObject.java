package com.spring.legacy;

import java.util.UUID;

public class myObject {

	private String id;
	private String myProp;

	public myObject() {
		this.id = UUID.randomUUID().toString();
	}

	public void myObjectDoes() {

		System.out.println("# myObjectDoes ");
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMyProp() {
		return myProp;
	}

	public void setMyProp(String myProp) {
		this.myProp = myProp;
	}

	@Override
	public String toString() {
		return "myObject [id=" + id + ", myProp=" + myProp + "]";
	}


}
