package com.example.groovy_engine.controller;

import com.example.groovy_engine.mapper.GroovyContentMapper;
import com.example.groovy_engine.model.ResponseVO;
import com.example.groovy_engine.service.GroovyManagerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RequestMapping("/groovy")
@RestController
@Slf4j
public class GroovyManagerController {
    @Autowired
    private GroovyManagerService groovyManagerService;

    @RequestMapping("/update")
    public ResponseVO updatePersonGroovy(MultipartFile multipartFile) {
        String result = groovyManagerService.updatePersonGroovy(multipartFile);
        if(result==null){
            return ResponseVO.isFail();
        }else {
            return ResponseVO.isOk(result);
        }
    }

    /**
     * 获取当前服务器的规则引擎
     */
    @RequestMapping("/get")
    public ResponseVO getPersonGroovy() {
        String result = groovyManagerService.getPersonGroovy();
        if(null==result){
            return ResponseVO.isFail();
        }else {
            return ResponseVO.isOk(result);
        }

    }

    /**
     * 每次更新规则的时候，将规则记录到表中
     */
    @RequestMapping("/db/person/show")
    public ResponseVO personGroovyShow() {

        return ResponseVO.isOk(null);
    }
}
