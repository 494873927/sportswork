package com.sportswork.sportswork.core.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Accessors(chain = true)    // 该注解设置chain=true，生成setter方法返回this（也就是返回的是对象），代替了默认的返回void。
public class User {
    private String id;
    private String openId;
    @NonNull private String username;
    @NonNull private String password;
    @NonNull private String phone;
    private int isDel;
    private Long registerTime;
    private String roleId;
    private List<Role> roleList;

    public User() {
    }

    public boolean getIsDelBoolean(){
        return isDel == 0;
    }

    public String getRoleCode(){
        StringBuilder roleCode = new StringBuilder();
        for (Role role : roleList){
            if(roleCode.length() > 0){
                roleCode.append(",");
            }
            roleCode.append(role.getName());
        }
        return roleCode.toString();
    }

    public String getRoleDescription(){
        StringBuilder roleName = new StringBuilder();
        for (Role role : roleList){
            if(roleName.length() > 0){
                roleName.append(",");
            }
            roleName.append(role.getDescription());
        }
        return roleName.toString();
    }

    /**
     * 判断用户信息是否合法
     * @param user 用户信息
     * @return true为合法
     */
    static public boolean checkUserInfo(User user) {
        // TODO 判断合法性
        return true;
    }
}

