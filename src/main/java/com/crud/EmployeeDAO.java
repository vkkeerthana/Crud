package com.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDAO {
@Autowired
EmployeeRepositry er;

public String postEmp(Employee e) {
	er.save(e);
	return "Posted successfully";
}

public List<Employee> getObj() {
	return er.findAll();
}

public String posting(List<Employee> e) {
	er.saveAll(e);
	return "Posted Successfully";
}

public Employee get(int i) {
	Optional<Employee> e=er.findById(i);
	return e.get();
}


}
