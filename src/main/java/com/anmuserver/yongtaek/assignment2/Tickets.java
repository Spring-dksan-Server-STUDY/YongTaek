package com.anmuserver.yongtaek.assignment2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Tickets {
    private String name;
    private int age;

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDate createdAt;

    private LocalDate departureAt;
    private LocalDate arriveAt;

    public Long getId(){
        return id;
    }

    public void print(){
        System.out.println("name" + this.name);
        System.out.println("age" + this.age);
        System.out.println("departureAt" + this.departureAt);
        System.out.println("arriveAt" + this.arriveAt);
    }


    public Tickets(final String name, final int age, final Long id, final String departureAt, final String arriveAt){
        this.id = id;
        this.name = name;
        this.age = age;
        this.departureAt = LocalDate.parse(departureAt);
        this.arriveAt = LocalDate.parse(arriveAt);
        this.createdAt = LocalDate.now();
    }
}
