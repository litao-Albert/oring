package com.study.Jpa.App;

import com.study.Jpa.Entity.department;
import com.study.Jpa.Entity.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;

public class testJpa {
    public static void main(String[] args) {
        insert();
    }
    public  static  void find(){
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("study");
        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        try {
            student student = manager.find(student.class, 1);
            System.out.println("student:"+student.getId());
            manager.remove(student);
            //manager.detach(student);//进入游离状态
            System.out.println("detach:"+student.getId());
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }finally {
            transaction.commit();
            manager.close();
            managerFactory.close();
        }

    }
    public  static  void insert(){
        //1.获取EntityManageFactory
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("study");
        //2.获取EntitiManaee
        EntityManager manager = entityManagerFactory.createEntityManager();
        System.out.println(manager);
        System.out.println("isopen-------"+manager.isOpen());
        //3.开启事务 ，执行相应得操作
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        student student = new student();
        student.setName("albert");
        student.setAge(24);
        student.setDate(new Date());
        //持久化实体
        //manager.persist(student);  //进入一个托管状态
        com.study.Jpa.Entity.student merge = manager.merge(student);
        System.out.println("==========");
        System.out.println(merge);
        //4.提交事务，关闭EntityManage
        tx.commit();
        manager.close();
        entityManagerFactory.close();

    }
    public  static  void delete(){
        //1.获取EntityManageFactory
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("study");
        //2.获取EntitiManaee
        EntityManager manager = entityManagerFactory.createEntityManager();
        System.out.println(manager);
        //3.开启事务 ，执行相应得操作
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        //通过主键去查询实体对象
        student student = manager.find(student.class, 1);
        System.out.println(student);
        manager.remove(student);
        //4.提交事务，关闭EntityManage
        tx.commit();
        manager.close();
        entityManagerFactory.close();

    }
    public  static  void update(){
        //1.获取EntityManageFactory
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("study");
        //2.获取EntitiManaee
        EntityManager manager = entityManagerFactory.createEntityManager();
        System.out.println(manager);
        //3.开启事务 ，执行相应得操作
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        //通过主键去查询实体对象
        student student = manager.find(student.class, 2);
        //student1.setId(1);
        student.setName("albert");
        student.setAge(24);
        //提交事务会主动修改
        //4.提交事务，关闭EntityManage
        tx.commit();
        manager.close();
        entityManagerFactory.close();

    }
}
