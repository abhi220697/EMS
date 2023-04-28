package com.demo.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Department;

/**
 * @author Abhishek Raj
 */

public interface DeptRepository extends  JpaRepository<Department,Integer>{ 
	
	Department findBydepartmentName(String name);

}
