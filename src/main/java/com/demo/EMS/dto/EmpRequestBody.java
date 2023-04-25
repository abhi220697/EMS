package com.demo.EMS.dto;

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
public class EmpRequestBody {
	private String firstName;
	private String lastName;
	private String contactNO;
	private String address;
}