package com.Jakecode.springboot.crudemployee.dao;

import com.Jakecode.springboot.crudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's is no need to write any code.
}
