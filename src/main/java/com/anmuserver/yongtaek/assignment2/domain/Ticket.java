package com.anmuserver.yongtaek.assignment2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class Ticket implements Serializable{
    private String name;
    private int age;

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate departureAt;
    private LocalDate arriveAt;

    public Ticket(final String name, final int age, final Long id, final String departureAt, final String arriveAt){
        this.id = id;
        this.name = name;
        this.age = age;
        this.departureAt = LocalDate.parse(departureAt);
        this.arriveAt = LocalDate.parse(arriveAt);
    }

    public Ticket() {

    }
}
