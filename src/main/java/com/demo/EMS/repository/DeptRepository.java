package com.demo.EMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.EMS.dao.Department;

public interface DeptRepository extends  CrudRepository<Department,Integer>{ 

}
