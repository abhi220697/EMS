package com.demo.EMS.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

/**
 * @author Abhishek Raj
 */
public class EmpDTO {
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	
	@Size(min=10, max=13)
	private String contactNO;
	
	private String address;
	
	private String departmentName;
}