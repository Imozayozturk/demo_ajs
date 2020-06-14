package com.example.demo_ajs.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "user_table")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 3161469476052945136L;
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long id;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String name;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String phone;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String mobilePhone;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String email;
    @Column(length = 250)
    @NotNull
    @Getter
    @Setter
    private String address;


}

