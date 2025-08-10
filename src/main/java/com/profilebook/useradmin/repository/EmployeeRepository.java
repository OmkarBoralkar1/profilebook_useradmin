package com.profilebook.useradmin.repository;

import com.profilebook.useradmin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
