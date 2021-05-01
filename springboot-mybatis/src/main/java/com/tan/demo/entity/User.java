package com.tan.demo.entity;

import lombok.Data;

@Data
public class User {
//    @NotNull(message = "id不能为空")
    private Long id;
//    @NotEmpty(message = "姓名不能为空")
//    @Length(min = 2,message = "姓名长度不能小于2位")
    private String name;
//    @Min(value = 60,message = "成绩必须大于60分")
    private String password;
    private double score;
}
