package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "report", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportid;

    private Integer reportbyid;

    private Integer reportedto;

    @Column(length = 200)
    private String reason;

    private Boolean isapproved = false;

    @Column(length = 20)
    private String createdby;

    private LocalDateTime createdat;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
