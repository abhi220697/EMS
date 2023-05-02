package com.demo.EMS.controllers;

import java.util.Collections;
import java.util.List;
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

import com.demo.EMS.dao.Department;
import com.demo.EMS.dto.DeptDto;
import com.demo.EMS.service.DeptService;

import jakarta.validation.Valid;

/**
 * @author Abhishek Raj
 */

@RestController
@RequestMapping("/app")
public class DepartmentController {

	@Autowired
	private DeptService deptService;

	@GetMapping("/dept")
	public ResponseEntity<Map<String, List<Department>>> getAllDepartment() {

		return ResponseEntity.status(HttpStatus.OK).body(deptService.getAllDepartment());
	}

	@PostMapping(path = "/add/dept", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, String>> addDepartment(@Valid @RequestBody DeptDto deptDto) {

		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(deptService.addDepartment(deptDto));
		}

		catch (Exception e) {

			return ResponseEntity.status(HttpStatus.CONFLICT)
					.body(Collections.singletonMap("message", "something went wrong."));
		}

	}

	@DeleteMapping("/delete/dept")
	public ResponseEntity<Map<String, String>> deleteDepartment() {
		return null;
	}

}
