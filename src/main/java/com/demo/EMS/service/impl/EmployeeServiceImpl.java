package com.demo.EMS.service.impl;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.EMS.dao.Employee;
import com.demo.EMS.dto.EmpRequestBody;
import com.demo.EMS.repository.EmpRepository;
import com.demo.EMS.repository.EmployeeRepository;
import com.demo.EMS.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Map<String, String> addEamployee(EmpRequestBody e) {
		
		Employee emp = new Employee();
		emp.setFirstName(e.getFirstName());
		emp.setLastName(e.getLastName());
		emp.setAddress(e.getAddress());
		emp.setContactNO(e.getContactNO());
		empRepository.save(emp);	
		return Collections.singletonMap("message","consumer registered successfully");
		
	}

	@Override
	public Map<String, String> deleteEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> updateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getEmployeesbyDept() {
		// TODO Auto-generated method stub
		return null;
	}

}
	

