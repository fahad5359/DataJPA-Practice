package com.example.datajpa;

import org.springframework.data.repository.CrudRepository;

//  WE EXTENDED THE "CrudRepository" because we want to use the crud operations
public interface EmployeeRepository extends CrudRepository <Employee, Long>{

}
