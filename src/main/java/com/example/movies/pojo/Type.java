package com.example.movies.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Type {
    private  Integer tid;
    private  String  tname;
    private List<Movie> movies;
}
