package com.study.Jpa.App;

import com.study.Jpa.Entity.student;
import com.study.Jpa.util.EntityManage;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class API {
    @Test
    public  void test02(){
        EntityManager entityManager = EntityManage.entityManager();
        String sql="select max (x.age) from student x";
        Query query = entityManager.createQuery(sql);
        System.out.println(query);
        List resultList = query.getResultList();

        System.out.println(resultList);

    }
    @Test
    public void test01(){
        EntityManager entityManager = EntityManage.entityManager();
        student s1 = entityManager.find(student.class, 2);
        student s2 = entityManager.find(student.class, 2);
        System.out.println(s1);
        System.out.println(s1==s2);
        student s3 = entityManager.getReference(student.class, 1);
        student s4 = entityManager.find(student.class, 1);
        System.out.println(s3.getClass());
        System.out.println(s1==s3);

    }

}
