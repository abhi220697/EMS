package com.demo.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Department;

/**
 * @author Abhishek Raj
 */

public interface DeptRepository extends  CrudRepository<Department,Integer>{ 

}
