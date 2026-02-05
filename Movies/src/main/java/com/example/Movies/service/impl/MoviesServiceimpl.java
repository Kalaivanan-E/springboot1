package com.example.Movies.service.impl;

import com.example.Movies.dto.MoviesDTO;
import com.example.Movies.entity.MoviesEntity;
import com.example.Movies.repository.MoviesRepository;
import com.example.Movies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServiceimpl implements MoviesService {

    @Autowired
    private MoviesRepository repo;

    public MoviesDTO createMovie(MoviesDTO moviesdto){
        MoviesEntity m1 = new MoviesEntity(
                moviesdto.getId(),
                moviesdto.getName(),
                moviesdto.getDescription(),
                moviesdto.getRating()
        );
        MoviesEntity savedm1 = repo.save(m1);
        return new MoviesDTO(
                moviesdto.getId(),
                moviesdto.getName(),
                moviesdto.getDescription(),
                moviesdto.getRating()
        );
    }
    public MoviesEntity getMovie(Long id){
        MoviesEntity m1 = repo.findByid(id);
        return m1;
    }
    public List<MoviesEntity> getAllMovie(){
        List<MoviesEntity> getall = repo.findAll();
        return getall;
    }
}
