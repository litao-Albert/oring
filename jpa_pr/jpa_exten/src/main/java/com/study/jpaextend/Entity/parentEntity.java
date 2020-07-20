package com.study.jpaextend.Entity;

import lombok.Data;

import javax.persistence.*;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="record_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "record_type")
//@Entity
@Data
public abstract class parentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
}
