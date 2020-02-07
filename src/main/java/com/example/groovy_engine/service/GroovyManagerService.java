package com.example.groovy_engine.service;

import org.springframework.web.multipart.MultipartFile;

public interface GroovyManagerService {
    /**
     * 更新groovy脚本
     * */
    String updatePersonGroovy(MultipartFile multipartFile);

    /**
     * 返回当前执行的person规则
     * */
    String getPersonGroovy();

}
