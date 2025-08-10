package com.profilebook.useradmin.repository;

import com.profilebook.useradmin.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
