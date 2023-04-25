package com.demo.EMS.service.impl;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.EMS.dao.Department;
import com.demo.EMS.dto.DeptDto;
import com.demo.EMS.repository.DeptRepository;
import com.demo.EMS.service.DeptService;

@Component
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Map<String, String> addDepartment( DeptDto deptDto) {
		
		Department dept = new Department();
		dept.setDepartmentName(deptDto.getDepartmentName());
		dept.setAcitive(deptDto.isAcitive());

		deptRepository.save(dept);	
		return Collections.singletonMap("message","department added successfully");
	}

	@Override
	public Map<String, String> deleteDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> updateDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getAllDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
