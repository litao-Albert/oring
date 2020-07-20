package com.study.Jpa.Entity;

import lombok.Data;

import javax.persistence.*;

@Table(name="department")
@Data
//@Entity
public class department {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  Integer id;
    private String name;
    @Transient
    private String AAA;
}
