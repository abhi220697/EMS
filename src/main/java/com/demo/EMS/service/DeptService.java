package com.demo.EMS.service;

import java.util.List;
import java.util.Map;

import com.demo.EMS.dao.Department;
import com.demo.EMS.dto.DeptDto;

/**
 * @author Abhishek Raj
 */

public interface DeptService {

	
	public Map<String, String> addDepartment( DeptDto deptDto );
	public Map<String, String> deleteDepartment();
	public Map<String, String> updateDepartment();
	public Map<String, List<Department>> getAllDepartment();
	
}
