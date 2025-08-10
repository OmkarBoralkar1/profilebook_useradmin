package com.profilebook.useradmin.repository;

import com.profilebook.useradmin.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Integer> {
}
