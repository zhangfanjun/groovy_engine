package com.example.groovy_engine.mapper;

import com.example.groovy_engine.model.GroovyContent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface GroovyContentMapper {
    @Insert("insert into groovy_content (groovy_content,create_time,use_time,groovy_type)" +
            "value (#{groovyContent},#{createTime},#{useTime},#{groovyType})")
    void addNew(GroovyContent content);
}
