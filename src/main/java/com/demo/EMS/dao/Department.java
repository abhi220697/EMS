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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author Abhishek Raj
 */
		
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private int DepartmentId;
	
	@Column(name = "department_name",unique=true)
	private String departmentName;
	
	@Column(name ="active_status")
	private boolean isAcitive;
	
	 @OneToMany(mappedBy="department")
	private Set<Employee>  employees;

	
}
