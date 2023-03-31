package com.anjali.core.core;

import com.anjali.core.core.model.Student;
import com.anjali.core.core.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class CoreApplicationTests {

	@Autowired
	private StudentRepository sr;
	@Autowired
	private Sample sample;
//	@Test
//	void testFunctions() {
//		Assertions.assertEquals(5,sample.sumOfTwoNumbers(2,3));
//	}

	@Test
	public void testStudent(){
		sr.save(new Student(12l, "Alina", 100));
		Student findStudent = sr.findById(12l).get();
		assertNotNull(findStudent);
	}

}
