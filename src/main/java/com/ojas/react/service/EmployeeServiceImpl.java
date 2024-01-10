package com.ojas.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.react.model.EmployeeEntity;
import com.ojas.react.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public EmployeeEntity SaveEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		EmployeeEntity saveemployee = repository.insert(employee);
		return saveemployee;
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> getallemployee = repository.findAll();
		return getallemployee;
	}

	@Override
	public void getEmployee(String empid) {
		// TODO Auto-generated method stub
		
	repository.findById(empid);
	}

	@Override
	public void deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		repository.deleteById(empid);
		
	}

}
