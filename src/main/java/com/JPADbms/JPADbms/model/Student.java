package com.JPADbms.JPADbms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Admin on 16/11/2017.
 */
@Entity
public class Student {
    @Id
    Integer id;

    String name;
    String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
