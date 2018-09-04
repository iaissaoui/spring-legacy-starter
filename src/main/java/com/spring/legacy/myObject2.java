package com.spring.legacy;

import java.util.UUID;

public class myObject2 {

	private String id;
	private String myProp;

	public myObject2() {
		this.id = UUID.randomUUID().toString();
	}

	public myObject2(String myProp) {
		super();
		this.myProp = myProp;
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
