package com.study.jpaextend.Entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Animal")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {
    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid",strategy = "uuid")
//    @Column(length = 32)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
}
