package com.demo.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Employee;


/**
 * @author Abhishek Raj
 */
public interface EmpRepository extends CrudRepository<Employee,Integer>{

}
