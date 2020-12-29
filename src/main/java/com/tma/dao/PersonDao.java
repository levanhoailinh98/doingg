package com.tma.dao;

import java.util.List;

import com.tma.model.Person;

public class PersonDao {
	public void showListStudent(List<Person> listPerson) {
		for(int i=0; i < listPerson.size(); i++) {
			System.out.println("Name: " + listPerson.get(i).getFirstName() + "Lastname: " + listPerson.get(i).getLastName());
		}
	}
}	
