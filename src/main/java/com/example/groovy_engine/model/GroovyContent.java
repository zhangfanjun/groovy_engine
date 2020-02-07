package com.example.groovy_engine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GroovyContent {
    /**
     * 主键
     * */
    private long id;

    /**
     * 规则内容
     * */
    private String groovyContent;

    /**
     * 创建时间
     * */
    private long createTime;

    /**
     * 使用时间
     * */
    private long useTime;

    /**
     * 规则类型，person
     * */
    private String groovyType;
}
