package com.study.jpaextend.Test;

import com.study.jpaextend.Entity.Cat;
import com.study.jpaextend.Entity.childEntity1;
import com.study.jpaextend.Entity.childEntity2;
import com.study.jpaextend.Entity.parentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class testExpend {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory =
                Persistence.createEntityManagerFactory("extend");
        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            Cat cat = new Cat();
            cat.setName("猫");
            cat.setAction("吃鱼");
            manager.persist(cat);
            tx.commit();

        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            manager.close();
            managerFactory.close();
        }
    }
}
