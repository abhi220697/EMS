package com.demo.EMS.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.EMS.dao.Department;
import com.demo.EMS.dao.Employee;
import com.demo.EMS.dto.EmpDTO;
import com.demo.EMS.exceptions.ResourceNotFoundException;
import com.demo.EMS.repository.DeptRepository;
import com.demo.EMS.repository.EmpRepository;
import com.demo.EMS.service.EmployeeService;

/**
 * @author Abhishek Raj
 */

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmpRepository empRepository;

	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Map<String, String> addEamployee(EmpDTO e) {

		Department dept = deptRepository.findBydepartmentName(e.getDepartmentName());
		Employee emp = new Employee();
		emp.setFirstName(e.getFirstName());
		emp.setLastName(e.getLastName());
		emp.setAddress(e.getAddress());
		emp.setContactNO(e.getContactNO());
		emp.setDepartment(dept);
		empRepository.save(emp);
		return Collections.singletonMap("message", "consumer registered successfully");

	}

	@Override
	public Map<String, String> deleteEmployee(int id) {
		
		Employee deleteEmployee = empRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));
		empRepository.delete(deleteEmployee);
		return Collections.singletonMap("message", "Employee deleted successfully");
		
	}

	@Override
	public Map<String, Employee> updateEmployee(int id, EmpDTO employeeDetails) {
		Employee updateEmployee = empRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

		updateEmployee.setFirstName(employeeDetails.getFirstName());
		updateEmployee.setLastName(employeeDetails.getLastName());
		updateEmployee.setContactNO(employeeDetails.getContactNO());

		empRepository.save(updateEmployee);

		return Collections.singletonMap("message", updateEmployee);

	}

	@Override
	public Map<String, List<Employee>> getAllEmployee() {

		List<Employee> employees = (List<Employee>) empRepository.findAll();

		return Collections.singletonMap("message", employees);
	}

	@Override
	public Map<String, List<Employee>> getEmployeesbyDept(int departmentId) {
		
		Department dept = deptRepository.findById(departmentId).orElseThrow( () -> new ResourceNotFoundException("Department not exist with id"+departmentId));
		
		
		List <Employee> employees = empRepository.findBydepartment(dept);
		

		return Collections.singletonMap("message", employees);
	}

}
