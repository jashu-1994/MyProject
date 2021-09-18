package com.softech.employee;

import com.softech.dto.EmployeeDTO;
import com.softech.entity.Employee;

public interface IEmployeeService {
	public Employee saveEmployee(EmployeeDTO empDTO);

}
