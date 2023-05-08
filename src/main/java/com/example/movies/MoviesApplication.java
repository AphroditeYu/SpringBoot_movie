package com.example.movies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/movies/mapper")
public class MoviesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }

}
