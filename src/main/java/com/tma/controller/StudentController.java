package com.tma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tma.dao.StudentDao;
import com.tma.form.StudentForm;
import com.tma.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDao studentDao;

	private static List<Student> students = new ArrayList<Student>();

	static {
		students.add(new Student("Bill", 10,9,8,0));
		students.add(new Student("Bill", 7,8,8,0));
	}

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		students = studentDao.caculateGPA(students);
		model.addAttribute("students", students);
		return "index";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String addStudentForm(Model model) {
		StudentForm studentForm = new StudentForm();
		model.addAttribute("studentForm", studentForm);
		return "addStudent";
	}

	@RequestMapping(value = "/addStudent")
	public String addStudentSave(Model model, @ModelAttribute("studentForm") StudentForm studentForm) {
		String fullName = studentForm.getFullName();
		float pointOne = studentForm.getPointOne();
		float pointTwo = studentForm.getPointTwo();
		float pointThree = studentForm.getPointThree();
		if (fullName != null && fullName.length() > 0) {
			Student newStudent = new Student(fullName, pointOne, pointTwo, pointThree);
			students.add(newStudent);
			return "redirect:/index";
		}
		String error = "Fullname is required";
		model.addAttribute("errorMessage", error);
		return "addStudent";
	}
	
	@RequestMapping(value = "/getStudents", produces="application/json", method = RequestMethod.GET)
	@ResponseBody public List<Student> getList() {
		List<Student> listStudentGPAMax = studentDao.getLargestGPA(students);
		return listStudentGPAMax;
	}

}
