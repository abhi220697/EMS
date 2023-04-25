package com.demo.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Employee;

public interface EmpRepository extends CrudRepository<Employee,Integer>{

}
