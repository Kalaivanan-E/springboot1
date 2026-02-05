package com.example.Movies.service;

import com.example.Movies.dto.MoviesDTO;
import com.example.Movies.entity.MoviesEntity;

import java.util.List;

public interface MoviesService {

    MoviesDTO createMovie(MoviesDTO moviesdto);
    MoviesEntity getMovie(Long id);
    List<MoviesEntity> getAllMovie();
}
