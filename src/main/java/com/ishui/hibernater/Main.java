package com.ishui.hibernater;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ishui.pojo.Boy;
import com.ishui.pojo.City;
import com.ishui.pojo.Person;
import com.ishui.tools.HibernateUtils;
import jdk.nashorn.internal.parser.JSONParser;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


/**
 * @Project: untitled14
 * @Package: com.ishui.hibernater
 * @Author:[李晓晖]
 * @date 2020-04-15 16:54
 * @Description: [该类的功能]
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("我在这里增加了一些文字");
//        Configuration configure = new Configuration().configure();
//        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
//        StandardServiceRegistry registry = builder.build();
//        SessionFactory sessionFactory = configure.buildSessionFactory(registry);
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Boy boy = new Boy();
//        boy.setSex("男");
//        boy.setAge(32);
//        boy.setAddress("桂城澜桂中路");
//        boy.setUsername("superwolfman");
//        try {
//            session.save(boy);
//            System.out.println("提交成功：" + boy.getId());
//            transaction.commit();
//        }catch (Exception e){
//            transaction.rollback();
//        }finally {
//            session.close();
//            sessionFactory.close();
//        }

//        Session session = HibernateUtils.getSession();
//        Transaction transaction = session.beginTransaction();
// 增加记录
//        Boy boy = new Boy();
//
//        boy.setUsername("superwolfman");
//        boy.setSex("男");
//        boy.setAge(32);
//        boy.setAddress("桂城澜桂中路");
//        System.out.println("save前 此时Boy的ID=" + boy.getId());
//
//        session.save(boy);
//        boy.setAddress("桂城2");

//        System.out.println("save后，此时Boy的ID=" + boy.getId());

        //更新记录
//        Boy boy = (Boy) session.get(Boy.class, 4);
//        boy.setUsername("新三");
//        session.update(boy);

//        Query query = session.createQuery("update Boy set username='新三' where id=4");
//        query.executeUpdate();

        //插入记录
//        Boy boy = (Boy) session.get(Boy.class, 4);
//        String s = JSONObject.toJSONString(boy);
//        Boy boy2 = JSONObject.parseObject(s,Boy.class);
////        boy2.setId(0);
//        session.save(boy2);
//        System.out.println("boy.id=");

//        Criteria criteria = session.createCriteria(Boy.class);
//        criteria.add(Restrictions.eq("username" ,"新三"));
//        criteria.add(Restrictions.ilike("username","张%"));
//        List list = criteria.list();
//        System.out.println(list);
//        transaction.commit();
//
//        HibernateUtils.finaly();
//        ObjectMapper mapper = new ObjectMapper();
        Boy boy = new Boy();
        boy.setSex("男");
        boy.setAge(32);
        boy.setAddress("桂城澜桂中路");
        boy.setUsername("superwolfman");

        Person p = new Person();
        p.setBoy(boy);
        p.setBirth(LocalDateTime.of(2019,5,23,3,43,22));



        String s1 = JSONObject.toJSONString(p);
        System.out.println(s1);
        System.out.println("+++++++++++++++++++++");
        Person ps = (Person)JSONObject.parseObject(s1,Person.class);
        System.out.println(ps);
        System.out.println(ps.getBirth().toLocalDate());
//        System.out.println("++++++++++++++++++++++++");
//        Person p = new Person();
//        p.setBoy(boy);
//        p.setBirth(LocalDateTime.of(2019,5,23,3,43,22));
//        System.out.println(p);
//        String s1 = mapper.writeValueAsString(p);
//        System.out.println(s1);
//        Person person = mapper.readValue(s1, Person.class);
//        System.out.println(person);
    }


}
