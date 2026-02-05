package com.example.Movies.repository;

import com.example.Movies.entity.MoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MoviesEntity,Long> {
    MoviesEntity findByid(Long id);
}
