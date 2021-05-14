package com.sportswork.sportswork.core.entity;

import com.sportswork.sportswork.core.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true) //该注解设置chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void。
public class Course extends BaseEntity {

    public String getId(){
        return this.id;
    }

    private String name;
    private String number;
    private String classHour;
}
