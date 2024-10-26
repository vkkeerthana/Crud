package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO ed;
	
	public String postEmp(Employee e) {
		return ed.postEmp(e);
	}

	public List<Employee> getObj() {
		return ed.getObj();
	}

	public String posting(List<Employee> e) {
		return ed.posting(e);
	}

	public Employee get(int i) {
		return ed.get(i);
	}

}
