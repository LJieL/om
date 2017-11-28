package com.example;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.pojo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class OmApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(OmApplication.class, args);
		ObjectMapper mapper = context.getBean(ObjectMapper.class);
	      System.out.println(mapper);
	     Student  stu = new Student("jack",21);
	      
	      try {
	             System.out.println(mapper.writeValueAsString(stu));
	      } catch (JsonProcessingException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	      }
	      
	      String json = "{\"name\":\"mike\",\"age\":22}";
	      
	      try {
	            Student stu1 = mapper.readValue(json, Student.class);
	             System.out.println(stu1);
	      } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	      }
		  Student stu2 =new Student("mike",22);
		  stu2.setAge(29);
		  System.out.println(stu2.getAge());
		  

		
	}
	@Bean 
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
		
	}
}
