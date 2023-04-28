package com.demo.EMS.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * @author Abhishek Raj
 */
@Entity
@Table(name = "Employee")
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id")
	private int empId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name ="contact_number")
	private String contactNO;
	@Column(name = "address")
	private String address;
	
    @ManyToOne
    @JsonIgnoreProperties("employees")
    @JoinColumn(name="department_id", nullable=false)
    private Department department;
	
	
	
	
}
