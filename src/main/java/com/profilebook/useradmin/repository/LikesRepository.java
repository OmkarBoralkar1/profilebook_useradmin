package com.profilebook.useradmin.repository;

import com.profilebook.useradmin.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Integer> {
}
