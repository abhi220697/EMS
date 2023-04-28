package com.demo.EMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Department;
import com.demo.EMS.dao.Employee;


/**
 * @author Abhishek Raj
 */
public interface EmpRepository extends CrudRepository<Employee,Integer>{
	
	List<Employee> findBydepartment(Department d);

}
