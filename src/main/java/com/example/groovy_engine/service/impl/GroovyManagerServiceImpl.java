package com.example.groovy_engine.service.impl;

import com.example.groovy_engine.model.ResponseVO;
import com.example.groovy_engine.service.GroovyContentService;
import com.example.groovy_engine.service.GroovyManagerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
public class GroovyManagerServiceImpl implements GroovyManagerService {

    public static final ExecutorService POOL = Executors.newFixedThreadPool(10);

    @Autowired
    private GroovyContentService groovyContentService;

    @Override
    public String updatePersonGroovy(MultipartFile multipartFile) {
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy")));

        ) {
//            multipartFile.transferTo(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy"));

            InputStream inputStream = multipartFile.getInputStream();
//            OutputStream outputStream = new FileOutputStream(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy"));
            IOUtils.copy(inputStream, bufferedWriter);

//            异步执行数据库操作
            POOL.execute(()->{
                String groovyString = getPersonGroovy();
                groovyContentService.addGroovyContent(groovyString,"person");
            });
            return "ok";
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public String getPersonGroovy() {
        try (
                BufferedReader bufferedWriter = new BufferedReader(new FileReader(new File("src/main/java/com/example/groovy_engine/groovy/PersonScript.groovy")));

        ) {
            StringBuilder builder = new StringBuilder();
            String row = null;
            while ((row = bufferedWriter.readLine())!=null){
                log.info("====={}",row);
                builder.append(row).append("\n");
            }
            return builder.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
