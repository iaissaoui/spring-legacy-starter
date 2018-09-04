package com.spring.legacy;

import java.util.UUID;

public class myObject {

	private String id;

	public myObject() {
		this.id = UUID.randomUUID().toString();
	}

	public void myObjectDoes() {

		System.out.println("# myObjectDoes ");
	}

	@Override
	public String toString() {
		return "myObject [id=" + id + "]";
	}

}
