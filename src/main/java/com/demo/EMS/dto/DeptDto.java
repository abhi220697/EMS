package com.demo.EMS.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Abhishek Raj
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeptDto {
	
	@NotBlank(message = "Department name is required")
	@NotNull(message = "it can not be null.")
	@Valid
	private String departmentName;
	
	@Valid
	@NotNull( message = "active status can not be null")
	private boolean isAcitive;
}