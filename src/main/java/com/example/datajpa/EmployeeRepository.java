package com.example.datajpa;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.From;
import java.util.List;


//  WE EXTENDED THE "CrudRepository" because we want to use the crud operations
public interface EmployeeRepository extends CrudRepository <Employee, Long>{

//    we create a method that do stuff for us, SpringData JPA dose allot of  good commands for us, and we dont need to
//    Write our own query...

//@Query("select e from Employee e where e.firstName = ?1")


}
