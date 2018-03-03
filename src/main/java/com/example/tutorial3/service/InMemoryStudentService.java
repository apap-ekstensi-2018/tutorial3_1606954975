package com.example.tutorial3.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm) {
		for(StudentModel i : studentList) {
			if(i.getNpm().equals(npm)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}
	
	@Override
	public StudentModel deleteStudent(String npm) {
		for(StudentModel x : studentList) {
			if(x.getNpm().equals(npm)) {
				studentList.remove(x);
				return x;
			}
		}
		return null;
	}
//	nomer 4 localhost:8080/student/view?npm=12345 tidak muncul karena data belum diinsert
	
}
