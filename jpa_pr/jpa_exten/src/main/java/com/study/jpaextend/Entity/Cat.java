package com.study.jpaextend.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "cat")
@Data
@Entity
public class Cat extends Animal {
    private String action;
}
