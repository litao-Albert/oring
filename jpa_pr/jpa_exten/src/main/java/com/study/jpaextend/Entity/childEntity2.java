package com.study.jpaextend.Entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
@Data
@DiscriminatorValue("2")
public class childEntity2 extends parentEntity {
    private  String child2;
}
