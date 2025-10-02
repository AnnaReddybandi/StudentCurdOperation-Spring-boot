package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Model.Student;
import com.spring.Repo.StudentRepo;
import com.spring.helper.StudentResponseStructure;

@RestController
public class StudentController {

	@Autowired
	StudentRepo strepo;

	@PostMapping("/saveData")
	public StudentResponseStructure<Student> savedata(@RequestBody Student st) {
		strepo.save(st);
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.CREATED.value());
		res.setMesg("data stored successfully");
		res.setDara(st);

		return res;
	}

	@GetMapping("/FetchData")
	public StudentResponseStructure<Student> fetchData(@RequestBody Student st1) {
		strepo.findAll();
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.FOUND.value());
		res.setMesg("Fetched all Data");
		res.setDara(st1);
		return res;
	}

	@GetMapping("/FetchByName")
	public StudentResponseStructure<Student> FetchByid(@RequestParam("name") String name) {
		strepo.findbyName(name);
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.FOUND.value());
		res.setMesg("Fetch by name");
		return res;

	}

	@GetMapping("/FetchByEmailAndPassword")
	public StudentResponseStructure<Student> FetchEmailAndPassword(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		strepo.FindByEmailAndPassword(email, password);
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.FOUND.value());
		res.setMesg("Fetch email and password");
		return res;
	}

	@DeleteMapping("/deleteById")
	public StudentResponseStructure<Student> DeleteById(@RequestParam("id") int id) {
		strepo.deleteById(id);
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.OK.value());
		res.setMesg("data deleted");
		return res;
	}

	@PutMapping("/updateByid")
	public StudentResponseStructure<Student> UpdateByid(@RequestBody Student st) {
		
		st.setEmail("djsdhsk");
		st.setLoc("djd");
		strepo.save(st);
		StudentResponseStructure<Student> res = new StudentResponseStructure<>();
		res.setStatusCode(HttpStatus.ACCEPTED.value());
		res.setMesg("data deleted");
		return res;
	}

}
