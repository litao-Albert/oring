package com.study.Jpa.Entity;


import javax.persistence.*;

@Table(name="orders")
//@Entity
public class order {
    private Integer id;
    private String name;
    private users users;
    @GeneratedValue
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
    @JoinColumn(name = "stu_id")
    @ManyToOne
    public com.study.Jpa.Entity.users getUsers() {
        return users;
    }

    public void setUsers(com.study.Jpa.Entity.users users) {
        this.users = users;
    }
}
