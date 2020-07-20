package com.study.Jpa.App;

import com.study.Jpa.Entity.order;
import com.study.Jpa.Entity.users;
import com.study.Jpa.util.EntityManage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class oneTOmeny {
    public static void main(String[] args) {
        //1.获取EntityManageFactory
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("study");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        users users = new users();
        users.setName("albert");
        users.setAge(24);
        users.setTel("1008611");
        order order = new order();
        order.setName("苹果");

        order order1 = new order();
        order1.setName("橘子");
        //设置关联关系
        users.getOrders().add(order);
        users.getOrders().add(order1);
        order.setUsers(users);
        order1.setUsers(users);
        //执行操作
        entityManager.persist(users);
        entityManager.persist(order);
        entityManager.persist(order1);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
