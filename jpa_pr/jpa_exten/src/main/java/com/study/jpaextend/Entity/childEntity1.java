package com.study.jpaextend.Entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
@Data
@DiscriminatorValue("1")
public class childEntity1 extends parentEntity {
    private  String child1;
}
