package com.example.groovy_engine.controller;

import com.example.groovy_engine.model.ResponseVO;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RequestMapping("/groovy")
@RestController
public class GroovyManagerController {

    @RequestMapping("/update")
    public ResponseVO updatePersonGroovy(MultipartFile multipartFile){
        try {
//            multipartFile.transferTo(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy"));

            InputStream inputStream = multipartFile.getInputStream();
            OutputStream outputStream = new FileOutputStream(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy"));
            IOUtils.copy(inputStream,outputStream);

        } catch (IOException e) {
            return ResponseVO.isFail();
        }
        return ResponseVO.isOk("ok");
    }

    /**
     * 获取当前服务器的规则引擎
     * */
    @RequestMapping("/get")
    public ResponseVO getPersonGroovy(){
        return ResponseVO.isOk(null);
    }

    /**
     * 每次更新规则的时候，将规则记录到表中
     *
     * */
    @RequestMapping("/db/person/show")
    public ResponseVO personGroovyShow(){

        return ResponseVO.isOk(null);
    }
}
