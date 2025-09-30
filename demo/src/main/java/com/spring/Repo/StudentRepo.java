package com.spring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	public void findbyName(String name);

	public void FindByEmailAndPassword(String email, String password);

}
