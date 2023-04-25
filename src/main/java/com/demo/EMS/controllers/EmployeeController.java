package com.demo.EMS.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.EMS.dto.EmpRequestBody;
import com.demo.EMS.model.EmployeeDetailResponse;
import com.demo.EMS.service.EmployeeService;

import jakarta.validation.Valid;
/**
@author Abhishek Raj
*/

@RestController
@RequestMapping("/app/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	

	@GetMapping("/emp")
	public EmployeeDetailResponse getEmployee() {
		employeeservice.getAllEmployee();
		
		return null;			
	}
	
@PostMapping(path= "/add/emp", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> addEmployee(@Valid @RequestBody EmpRequestBody empRequestBody )  {
	
	return ResponseEntity.status(HttpStatus.CREATED).body(employeeservice.addEamployee(empRequestBody));
}
	
	
	@DeleteMapping("/delete/emp")
	public EmployeeDetailResponse  deleteEmployee() {
		return null;}

	
}
