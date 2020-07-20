package com.study.Jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManage {
    private  static EntityManagerFactory entityManagerFactory=null;
    static {
        entityManagerFactory= Persistence.createEntityManagerFactory("study");
    }
    public static EntityManager entityManager(){
        return  entityManagerFactory.createEntityManager();

    }
}
