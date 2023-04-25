package com.demo.EMS.controllers;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EMS.dto.DeptDto;
import com.demo.EMS.model.EmployeeDetailResponse;
import com.demo.EMS.service.DeptService;

import jakarta.validation.Valid;
/**
@author Abhishek Raj
*/

@RestController
@RequestMapping("/app/v1")
public class DepartmentController {
	
	@Autowired
	private DeptService deptService;
	

	@GetMapping("/dept")
	public EmployeeDetailResponse getDepartment() {
		
		return null;			
	}
	
 @PostMapping(path= "/add/dept", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> addDepartment(@Valid @RequestBody DeptDto deptDto )  {
	
	return ResponseEntity.status(HttpStatus.CREATED).body(deptService.addDepartment(deptDto));
}
	
	
	@DeleteMapping("/delete/dept")
	public ResponseEntity<Map<String, String>>  deleteDepartment() {
		return null;}

	
}
