package com.demo.EMS.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeDetailResponse {
	
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private int age;
	
}
