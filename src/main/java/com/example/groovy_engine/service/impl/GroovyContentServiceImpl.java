package com.example.groovy_engine.service.impl;

import com.example.groovy_engine.mapper.GroovyContentMapper;
import com.example.groovy_engine.model.GroovyContent;
import com.example.groovy_engine.service.GroovyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroovyContentServiceImpl implements GroovyContentService {
    @Autowired
    private GroovyContentMapper groovyContentMapper;
    @Override
    public void addGroovyContent(String groovyString,String groovyType) {
        GroovyContent content = new GroovyContent();
        content.setGroovyContent(groovyString);
        long nowTime = System.currentTimeMillis();
        content.setCreateTime(nowTime);
        content.setUseTime(nowTime);
        content.setGroovyType(groovyType);
        groovyContentMapper.addNew(content);
    }

    @Override
    public String getInfoById(long id) {
        return groovyContentMapper.getInfoById(id);
    }

    @Override
    public List<GroovyContent> dbShow(String type) {
        return groovyContentMapper.dbShow(type);
    }
}
