package com.profilebook.useradmin.repository;

import com.profilebook.useradmin.entity.CommentPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentPostRepository extends JpaRepository<CommentPost, Integer> {
}
