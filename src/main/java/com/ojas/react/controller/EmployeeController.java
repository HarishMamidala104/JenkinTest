package com.ojas.react.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.react.model.EmployeeEntity;
import com.ojas.react.service.EmployeeServiceImpl;

@RestController
@RequestMapping("all")

public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl service;
	//private static final Logger logger = Logger.getLogger(.class.getName());

    
	@PostMapping("/create")
	public EmployeeEntity createEmployee(@RequestBody EmployeeEntity saveemployee) {
		//Logger.info(saveemployee);
		EmployeeEntity saveEmployee2 = service.SaveEmployee(saveemployee);
		
		return saveEmployee2;
		}
	@GetMapping("/getall")
	public List<EmployeeEntity> AllEmployee(){
		List<EmployeeEntity> allEmployee = service.getAllEmployee();
	 return allEmployee;	
	}

}
