package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "commentpost", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentid;

    private Integer postid;

    private Integer eid;

    @Column(length = 200)
    private String comment;

    private LocalDateTime commentedat;

    @Column(length = 20)
    private String createdby;

    private LocalDateTime createdat;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
