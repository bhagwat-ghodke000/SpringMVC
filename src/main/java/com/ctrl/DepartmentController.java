package com.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dto.DepartmentDto;
import com.entity.Department;
import com.service.Impl.DepartmentImpl;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentImpl departmentImpl;
	
	@RequestMapping(value="/addDepartment",method = RequestMethod.GET)
	public String addDepartment(){
		return "adddepartment";
	}
	
	@RequestMapping(value="/saveDepartment",method = RequestMethod.POST)
	public String saveDepartment(@ModelAttribute DepartmentDto departmentDto) {
		
		DepartmentDto addDepartment = this.departmentImpl.addDepartment(departmentDto);
		return "adddepartment";
	}
	
	
	@RequestMapping(value="/getAllDepartment",method = RequestMethod.GET)
	public String getAllDepartment(Model model) {
		
		List<Department> allDepartment = this.departmentImpl.getAllDepartment();
		model.addAttribute("allDepartment", allDepartment);
		return "allDepartment";
	}
}
