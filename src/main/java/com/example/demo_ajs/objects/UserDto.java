package com.example.demo_ajs.objects;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 6671232981235527228L;
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private String mobilePhone;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String address;

}
