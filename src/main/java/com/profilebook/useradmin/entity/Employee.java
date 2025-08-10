package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Employee", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;

    @Column(length = 20)
    private String ename;

    @Column(length = 10)
    private String epass;

    private Integer deptid;

    private Boolean isadmin = false;

    @Column(length = 10)
    private String status;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
