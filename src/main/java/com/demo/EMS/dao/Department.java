package com.demo.EMS.dao;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

		
@Entity
@Setter
@Getter
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private int DepartmentId;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name ="active_status")
	private boolean isAcitive;
	
	@OneToMany(targetEntity = Employee.class, cascade= CascadeType.ALL, fetch = FetchType.LAZY , orphanRemoval = true)
	@JoinColumn(name = "dept_id", referencedColumnName = "department_id")
	
	private Set<Employee>  employees;

	
}
