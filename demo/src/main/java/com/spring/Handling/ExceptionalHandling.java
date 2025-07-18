package com.spring.Handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.Model.Student;
import com.spring.helper.StudentResponseStructure;

@RestControllerAdvice
public class ExceptionalHandling {

	@ExceptionHandler(StudentNotFound.class)
	public StudentResponseStructure<Student> m1(Student stu){
		StudentResponseStructure<Student> rs= new StudentResponseStructure<>();
		   rs.setStatusCode(HttpStatus.OK.value());
		   rs.setMesg("Student not found");
		   rs.setDara(stu);
		   return rs;
	}
}
