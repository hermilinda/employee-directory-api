package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;

	// @Autowired
	// private IBaseJPADAO baseJPADAO;

	public List<EmpRecord> getUser(EmpRecord empRecord) {
		String id = empRecord.getId();
		String name = empRecord.getName();
		String email = empRecord.getEmail();
		String designation = empRecord.getDesignation();
		String salary = empRecord.getSalary();

		if (id != null) {
			List<EmpRecord> list = new ArrayList<>();
			EmpRecord empRecord1 = empRepository.findOne(id);
			list.add(empRecord1);
			return list;
		} else if (name != null) {
			return empRepository.findByName(name);
		} else if (email != null) {
			return empRepository.findByEmail(email);
		} else if (designation != null) {
			return empRepository.findByDesignation(designation);
		} else if (salary != null) {
			return empRepository.findBySalary(salary);
		}

		else {
			return null;
		}
	}

	public EmpRecord addEmp(EmpRecord empRecord) {
		return empRepository.save(empRecord);
	}

	public List<EmpRecord> getAllEmployees() {
		// List<EmpRecord> employeeRecords = new ArrayList<>();
		// employeeRepository.findAll().forEach(employeeRecords::add);
		return (List<EmpRecord>) empRepository.findAll();
	}
}
