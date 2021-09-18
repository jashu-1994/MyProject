package com.softech.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.dto.EmployeeDTO;
import com.softech.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO empDao;

	@Override
	public Employee saveEmployee(EmployeeDTO empDTO) {
		Employee emp = new Employee();
		emp.setName(empDTO.getName());
		emp.setGander(empDTO.getGander());
		emp.setAddress(empDTO.getAddress());
		emp.setCity(empDTO.getCity());
		emp.setSalary(empDTO.getSalary());

		return empDao.saveEmployee(emp);
	}

}
