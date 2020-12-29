package com.tma.model;

public class Person {
	private String firstName;
	private String lastName;
	private float diem1;
	private float diem2;
	private float diemTB;

	public Person(String firstName, String lastName, float diem1, float diem2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.diem1 = diem1;
		this.diem2 = diem2;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public Person() {

	}

	public float getDiem1() {
		return diem1;
	}

	public void setDiem1(float diem1) {
		this.diem1 = diem1;
	}

	public float getDiem2() {
		return diem2;
	}

	public void setDiem2(float diem2) {
		this.diem2 = diem2;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
