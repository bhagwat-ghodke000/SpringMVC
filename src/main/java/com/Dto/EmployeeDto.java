package com.Dto;

import com.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private int empolyeeId;
	
	private String name;
	
	private String gender;
	
	private String city;
	
	private String department;
}
