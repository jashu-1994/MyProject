package com.softech.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softech.dto.EmployeeDTO;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeService empService;

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") EmployeeDTO emp) {
		empService.saveEmployee(emp);
		return "Employee Save Successfully";
	}

}
