package com.study.jpaextend.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "dog")
public class Dod extends Animal {
    private  String action;
}
