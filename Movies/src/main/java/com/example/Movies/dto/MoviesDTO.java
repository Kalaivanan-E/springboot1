package com.example.Movies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MoviesDTO {
    private Long id;
    private String name;
    private String description;
    private double rating;
}
