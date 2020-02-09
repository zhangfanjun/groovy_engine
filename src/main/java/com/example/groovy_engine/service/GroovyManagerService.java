package com.example.groovy_engine.service;

import com.example.groovy_engine.model.GroovyContent;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GroovyManagerService {
    /**
     * 更新groovy脚本
     * */
    String updatePersonGroovy(MultipartFile multipartFile);

    /**
     * 返回当前执行的person规则
     * */
    String getPersonGroovy();

    /**
     * 查看数据库人员的展示
     * */
    List<GroovyContent> dbShow(String type);

    /**
     * 通过主键id进行更新person规则
     * */
    String updatePersonById(long id);
}
