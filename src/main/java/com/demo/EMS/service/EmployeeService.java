package com.demo.EMS.service;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.EMS.dto.EmpDTO;


/**
 * @author Abhishek Raj
 */
@Service
@Component
public interface EmployeeService {
	
	public Map<String, String> addEamployee(EmpDTO e);
	public Map<String, String> deleteEmployee();
	public Map<String, String> updateEmployee();
	public Map<String, String> getAllEmployee();
	public Map<String, String> getEmployeesbyDept();
	
	
}
