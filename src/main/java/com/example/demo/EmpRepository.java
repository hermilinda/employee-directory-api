package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmpRepository extends CrudRepository<EmpRecord, String> {

	List<EmpRecord> findById(String id);

	List<EmpRecord> findByName(String name);

	List<EmpRecord> findByEmail(String email);

	List<EmpRecord> findByDesignation(String designation);

	List<EmpRecord> findBySalary(String salary);

}
