package com.requestValidation.ExceptionHandling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    private int userId;
    private String name;
    private String email;
    private String mobileNo;
    private String gender;
    private int age;
    private String nationality;
}
