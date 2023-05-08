package com.example.movies.controller;

import com.example.movies.mapper.MovieMapper;
import com.example.movies.mapper.TypeMapper;
import com.example.movies.pojo.Movie;
import com.example.movies.pojo.Type;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Movie")
@CrossOrigin(origins = "*")

public class MovieController {
     @Resource
     MovieMapper movieMapper;
     @Resource
     TypeMapper typeMapper;

//     @GetMapping("/movies")
//    public List<Movie>  getMovieData(){
//         return movieMapper.listMovie();
//     }
//    @GetMapping("/types")
//    public List<Type> getTypeData(){
//        return typeMapper.listType();
//    }

    @GetMapping("/getTypeAndMovie")
    public List<Type> getTypeAndMovie(){
        return typeMapper.listTypeWithMovies();
    }
    @GetMapping("/getMovieById")
    public Movie getMovieById(int id){
        return movieMapper.getMovieById(id);
    }
}
