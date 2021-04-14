package com.sportswork.sportswork.core.entity;

import com.sportswork.sportswork.core.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author dengwei
 * @date 2020/1/9 13:29
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Field extends BaseEntity {
    public String getId(){
        return this.id;
    }

    private String name;
    private String state;
    private List<TimeAxis> timeAxes;
}