package com.example.movies.Dao;

import com.example.movies.pojo.Type;

import javax.annotation.Resource;

public class MovieDaoImpl implements MovieDao{
    @Resource
    MovieDao movieDao;
    @Override
    public Type selectTypeAndMovie(int id) {
        return movieDao.selectTypeAndMovie(id); //连表查询两个表里的数据
    }
}
