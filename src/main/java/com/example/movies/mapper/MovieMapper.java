package com.example.movies.mapper;

import com.example.movies.pojo.Movie;
import com.example.movies.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieMapper {
   @Select("select  * from movies where mid=#{id}")
    Movie getMovieById(int id);
}
