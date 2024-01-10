package com.ojas.react.service;

import java.util.List;

import com.ojas.react.model.EmployeeEntity;

public interface EmployeeService {
	public EmployeeEntity SaveEmployee(EmployeeEntity employee);
	public List<EmployeeEntity> getAllEmployee();
	public void getEmployee(String empid);
	public void deleteEmployee(String empid);

}
