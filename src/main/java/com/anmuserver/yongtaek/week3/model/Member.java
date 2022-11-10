package com.anmuserver.yongtaek.week3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {
    private String name;
    private int age;

    @Id
    @GeneratedValue
    private Long id;

    public Member() {

    }

    public Member(final Long id, final String name, final int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

