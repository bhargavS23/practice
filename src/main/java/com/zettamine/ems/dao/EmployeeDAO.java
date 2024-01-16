package com.zettamine.ems.dao;

import java.util.List;

import com.zettamine.ems.Employee;

public interface EmployeeDAO {
	
	public Employee findById(int id);
	
	public Employee findByName(String name);
	
	public List<Employee> findAll();
 	

}
