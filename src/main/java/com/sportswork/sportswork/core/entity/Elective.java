package com.sportswork.sportswork.core.entity;

import com.sportswork.sportswork.core.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Elective extends BaseEntity {

    public String getId(){
        return this.id;
    }

    private String studentId;
    private String teachingId;
    private String score;

    private Student student;
    private Teaching teaching;
}
