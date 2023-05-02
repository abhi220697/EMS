package com.demo.EMS.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EMS.dao.Employee;
import com.demo.EMS.dto.EmpDTO;
import com.demo.EMS.exceptions.ResourceNotFoundException;
import com.demo.EMS.model.EmployeeDetailResponse;
import com.demo.EMS.repository.EmpRepository;
import com.demo.EMS.service.EmployeeService;

import jakarta.validation.Valid;

/**
 * @author Abhishek Raj
 */

@RestController
@RequestMapping("/ems")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/emp")
	public ResponseEntity<Map<String, List<Employee>>> getAllEmployee() {

		return ResponseEntity.status(HttpStatus.OK).body(employeeservice.getAllEmployee());
	}

	@PostMapping(path = "/add/emp", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> addEmployee(@Valid @RequestBody EmpDTO empRequestBody) {

		return ResponseEntity.status(HttpStatus.CREATED).body(employeeservice.addEamployee(empRequestBody));
	}
	
	@PutMapping (path ="/update/emp/{id}", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Employee>> updateEmployee(@PathVariable int id ,@RequestBody EmpDTO employeeDetails){
		
        return ResponseEntity.status(HttpStatus.OK).body(employeeservice.updateEmployee(id, employeeDetails));
		
	}

	@DeleteMapping("/delete/emp/{id}")
	public ResponseEntity<Map<String, String>>  deleteEmployee(@PathVariable int id) {
		
		return ResponseEntity.status(HttpStatus.OK).body(employeeservice.deleteEmployee(id));
	}
	
	@GetMapping("/empByDept/{id}")
	public ResponseEntity<Map<String,List<Employee>>> getEmployeeByDepartment(@PathVariable int id){
		
		return ResponseEntity.status(HttpStatus.OK).body(employeeservice.getEmployeesbyDept(id));
		
	}

}
