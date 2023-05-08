package com.example.movies.mapper;

import com.example.movies.pojo.Type;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TypeMapper {
    @Select("select * from types")
    List<Type> listType();

    List<Type> listTypeWithMovies();
}
