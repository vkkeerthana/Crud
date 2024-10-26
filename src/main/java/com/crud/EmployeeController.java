package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired//act as an object to connect class//single ton object creation
	EmployeeService es;
	
	@PostMapping(value="/postEmp")
	public String postEmp(@RequestBody Employee e) {
		return es.postEmp(e);
	}
	@GetMapping(value="/getObjs")
	public List<Employee> getObj(){
		return es.getObj();
	}
	@PostMapping(value="/postAll")
	public String posting(@RequestBody List<Employee> e) {
		return es.posting(e);
	}
	@GetMapping(value="/getSingle")
	public Employee get(@RequestParam int i) {
		return es.get(i);
	}
	
	

}
