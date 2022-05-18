package com.example.datajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }
   @Bean
    public CommandLineRunner run(EmployeeRepository rpstry){
        return (args -> {
            newEmplyees(rpstry);
            System.out.println(rpstry.findAll());


        });
    }


//    Here we  create the method  that Creates employeez
//    so it gose through Our Entity class and  creates a new  emlyee oout oof it
    private void newEmplyees(EmployeeRepository rpstry){
        rpstry.save(new Employee("Ahmad","Ali"));
        rpstry.save(new Employee("Naif","Ahmad"));
        rpstry.save(new Employee("Mohammed","rashed"));
        rpstry.save(new Employee("rashed","abdullah"));
    }
}
