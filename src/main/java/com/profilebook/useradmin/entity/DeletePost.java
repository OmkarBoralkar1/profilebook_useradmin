package com.profilebook.useradmin.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "deletepost", schema = "training_project_demo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeletePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deleteid;

    private Integer postid;

    private Integer eid;

    private LocalDateTime deletiondate;

    @Column(length = 20)
    private String createdby;

    private LocalDateTime createdat;

    @Column(length = 20)
    private String modifiedby;

    private LocalDateTime modifiedat;
}
