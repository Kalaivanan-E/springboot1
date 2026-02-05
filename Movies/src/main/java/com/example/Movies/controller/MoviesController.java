package com.example.Movies.controller;


import com.example.Movies.dto.MoviesDTO;
import com.example.Movies.entity.MoviesEntity;
import com.example.Movies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")

public class MoviesController {
    @Autowired
    private MoviesService service;

    @PostMapping("/create")
    public ResponseEntity<MoviesDTO> createMovie(@RequestBody MoviesDTO moviesdto){
        MoviesDTO create = service.createMovie(moviesdto);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<MoviesEntity> getMovie(@PathVariable Long id){
        MoviesEntity get = service.getMovie(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @GetMapping("/getall")
    public List<MoviesEntity> getAllMovie(){
        List<MoviesEntity> getall = service.getAllMovie();
        return getall;
    }
}
