package com.tma.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.tma.model.Student;

@Service
public class StudentDao {

	public void showListStudents(List<Student> listStudent) {
		for (Student student : listStudent) {
			System.out.println("Name: " + student.getFullName() + "\nPoint: " + student.getPointOne() + "\nPoint: "
					+ student.getPointTwo() + "\nPoint: " + student.getPointThree() + "\nGPA: " + student.getPointGPA()
					+ "\n");
		}
	}

	public List<Student> getListStudents(List<Student> listStudent) {
		return listStudent;
	}
	
	public List<Student> getLargestGPA(List<Student> students) {
		float pointMax = 0;
		float GPAMax = 0;
		for (Student student : students) {
			if (student.getPointGPA() > pointMax) {
				pointMax = student.getPointGPA();
			}
		}
		GPAMax = pointMax;
		List<Student> listStudentGPAMax = new ArrayList<>();
		for (Student student : students) {
			if (student.getPointGPA() == GPAMax)
				listStudentGPAMax.add(student);
		}
		return listStudentGPAMax;
	}

	public List<Student> caculateGPA(List<Student> listStudent) {
		List<Student> list = new ArrayList<Student>();
		for (Student student : listStudent) {
			student.setPointGPA((student.getPointOne() + student.getPointTwo() + student.getPointThree()) / 3);
			list.add(student);
		}
		return list;
	}
	
	public List<Student> caculateGPAByOne(Student student) {
			student.setPointGPA((student.getPointOne() + student.getPointTwo() + student.getPointThree()) / 3);
			List<Student> listStudent = new ArrayList<Student>();
			listStudent.add(student);
		return listStudent;
	}

	public void addStudent(Student student, List<Student> listStudent) {
		listStudent.add(student);
	}

	public Student inputInformationStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm thứ nhất: ");
		float pointOne = scanner.nextFloat();
		System.out.println("Nhập điểm thứ hai: ");
		float pointTwo = scanner.nextFloat();
		System.out.println("Nhập điểm thứ ba: ");
		float pointThree = scanner.nextFloat();
		Student student = new Student(name, pointOne, pointTwo, pointThree);
		return student;
	}

	public void findLargestGPA(List<Student> students) {
		float pointMax = 0;
		float GPAMax = 0;
		for (Student student : students) {
			if (student.getPointGPA() > pointMax) {
				pointMax = student.getPointGPA();
			}
		}
		GPAMax = pointMax;
		List<Student> listStudentGPAMax = new ArrayList<>();
		for (Student student : students) {
			if (student.getPointGPA() == GPAMax)
				listStudentGPAMax.add(student);
		}
		this.showListStudents(listStudentGPAMax);
	}

	public void findLowestGPA(List<Student> students) {
		float pointMin = 10;
		float GPAMin = 0;
		for (Student student : students) {
			if (student.getPointGPA() < pointMin) {
				pointMin = student.getPointGPA();
			}
		}
		GPAMin = pointMin;
		List<Student> listStudentGPAMax = new ArrayList<>();
		for (Student student : students) {
			if (student.getPointGPA() == GPAMin)
				listStudentGPAMax.add(student);
		}
		this.showListStudents(listStudentGPAMax);
	}
	
}
