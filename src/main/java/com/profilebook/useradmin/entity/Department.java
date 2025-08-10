package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Department", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptid;

    @Column(length = 20)
    private String deptname;

    @Column(length = 20)
    private String location;
}
