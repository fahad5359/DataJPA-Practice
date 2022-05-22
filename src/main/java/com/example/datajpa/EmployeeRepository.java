package com.example.datajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//  WE EXTENDED THE "CrudRepository" because we want to use the crud operations
public interface EmployeeRepository extends CrudRepository <Employee, Long>{
//    we create a method that do stuff for us, SpringData JPA dose allot of  good commands for us, and we dont need to
//    Write our own query...
        List<Employee>  findEmployeeByFirstNameAnd(String stonk);
}
