package com.tma.model;
public class Student {
	private String fullName;
	private float pointOne;
	private float pointTwo;
	private float pointThree;
	private float pointGPA;

	public Student() {
		
	}

	public Student(String fullName, float pointOne, float pointTwo, float pointThree) {
		super();
		this.fullName = fullName;
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public Student(String fullName, float pointOne, float pointTwo, float pointThree, float pointGPA) {
		super();
		this.fullName = fullName;
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
		this.pointGPA = pointGPA;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getPointOne() {
		return pointOne;
	}

	public void setPointOne(float pointOne) {
		this.pointOne = pointOne;
	}

	public float getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(float pointTwo) {
		this.pointTwo = pointTwo;
	}

	public float getPointThree() {
		return pointThree;
	}

	public void setPointThree(float pointThree) {
		this.pointThree = pointThree;
	}

	public float getPointGPA() {
		return pointGPA;
	}

	public void setPointGPA(float pointGPA) {
		this.pointGPA = pointGPA;
	}

}
