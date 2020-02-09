package com.example.groovy_engine.service;

import com.example.groovy_engine.model.GroovyContent;

import java.util.List;

public interface GroovyContentService {
    void addGroovyContent(String groovyString,String groovyType);

    /**
     * 根据类型进行数据的展示，考虑分页
     */
    List<GroovyContent> dbShow(String type);

    /**
     * 根据id主键对person规则进行替换
     * */
    String getInfoById(long id);
}
