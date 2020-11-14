package com.tcs.Employee.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	private int id;
	private int organizationId;
	private String name;
	private List<Employee> employees;
	
	
	
}