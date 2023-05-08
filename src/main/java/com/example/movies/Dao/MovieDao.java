package com.example.movies.Dao;

import com.example.movies.pojo.Movie;
import com.example.movies.pojo.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieDao {
    Type selectTypeAndMovie(int id);
}
