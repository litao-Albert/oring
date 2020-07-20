package com.study.Jpa.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "students")
@Entity
public class student {
    private Integer id;
    private String name;
    @Column(name = "age",length = 3,unique = true)
    private  Integer age;
    @Temporal(TemporalType.DATE)
    private  Date date;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
