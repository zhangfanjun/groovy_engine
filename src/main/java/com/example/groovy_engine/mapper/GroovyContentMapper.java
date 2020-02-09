package com.example.groovy_engine.mapper;

import com.example.groovy_engine.model.GroovyContent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroovyContentMapper {
    @Insert("insert into groovy_content (groovy_content,create_time,use_time,groovy_type)" +
            "value (#{groovyContent},#{createTime},#{useTime},#{groovyType})")
    void addNew(GroovyContent content);

    @Select("select * from groovy_content where groovy_type = #{type}")
    List<GroovyContent> dbShow(@Param("type") String type);

    @Select("select groovy_content from groovy_content where id = #{id}")
    String getInfoById(long id);
}
