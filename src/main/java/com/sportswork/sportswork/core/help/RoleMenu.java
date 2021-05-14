package com.sportswork.sportswork.core.help;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RoleMenu implements Serializable {
    private String id;
    private String roleId;
    private String menuId;
}
