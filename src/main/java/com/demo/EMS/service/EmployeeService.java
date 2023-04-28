package com.demo.EMS.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.EMS.dao.Employee;
import com.demo.EMS.dto.EmpDTO;


/**
 * @author Abhishek Raj
 */
@Service
@Component
public interface EmployeeService {
	
	public Map<String, String> addEamployee(EmpDTO e);
	
	public Map<String, Employee> updateEmployee(int id, EmpDTO employeeDetails);
	
	public Map<String, List<Employee>> getAllEmployee();
	
	public Map<String, String> deleteEmployee(int id);
	
	public Map<String, List<Employee>> getEmployeesbyDept(int departmentId);
	
	
}
