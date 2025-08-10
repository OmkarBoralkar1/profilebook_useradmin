package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lid;

    private Integer eid;

    private Integer postid;

    @Column(length = 20)
    private String createdby;

    private LocalDateTime createdat;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
