package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Post", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postid;

    private Integer eid;

    @Column(length = 200)
    private String post;

    private Boolean isapproved = false;

    @Column(length = 20)
    private String createdby;

    private LocalDateTime createdat;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
