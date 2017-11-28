package com.example.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private static final long serialVersionUID =4464233896798170486l;
	private String name;
	private int age;
	
}