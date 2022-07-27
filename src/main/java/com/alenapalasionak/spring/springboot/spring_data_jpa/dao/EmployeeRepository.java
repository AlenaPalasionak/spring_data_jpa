package com.alenapalasionak.spring.springboot.spring_data_jpa.dao;

import com.alenapalasionak.spring.springboot.spring_data_jpa.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {// в дженериках:
    //с каким entity будем работать и какой тип у его primary key
    //класс предоставит дефолтные методы

    public List<Employee> findAllByName (String name);//метод без реализации, имя стандартное - спринг все сам поймет

}
