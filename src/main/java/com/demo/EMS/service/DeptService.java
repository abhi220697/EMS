package com.demo.EMS.service;

import java.util.Map;
import com.demo.EMS.dto.DeptDto;

public interface DeptService {

	
	public Map<String, String> addDepartment( DeptDto deptDto );
	public Map<String, String> deleteDepartment();
	public Map<String, String> updateDepartment();
	public Map<String, String> getAllDepartment();
	
}
