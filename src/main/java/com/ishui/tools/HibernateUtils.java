package com.ishui.tools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @Project: untitled14
 * @Package: com.ishui.tools
 * @Author:[李晓晖]
 * @date 2020-04-16 12:05
 * @Description: [该类的功能]
 */
public class HibernateUtils {
    static Configuration config = null;
    static StandardServiceRegistryBuilder builder = null;
    static StandardServiceRegistry registry = null;
    static SessionFactory factory = null;
    static Session session = null;

    public static Configuration getConfig() {

        if(config == null) {
            config = new Configuration().configure();
        }

        return config;
    }

    public static  StandardServiceRegistryBuilder getBuilder() {
        if(builder == null){
            builder = new StandardServiceRegistryBuilder().applySettings(getConfig().getProperties());
        }
        return builder;

    }

    public static  StandardServiceRegistry getRegistry() {
        if(registry == null){
            registry = getBuilder().build();
        }
        return registry;
    }

    public static  SessionFactory getFactory() {
        if(factory == null){
            factory = getConfig().buildSessionFactory(getRegistry());
        }
        return factory;
    }


    public static  Session getSession() {
        if(session == null || !session.isOpen()){
            session = getFactory().openSession();
        }
        return session;
    }

    public static void finaly(){
        if(session != null){
            session.close();
        }
        if(factory != null){
            factory.close();
        }

        if(registry != null){
            StandardServiceRegistryBuilder.destroy(getRegistry());
        }

    }
    public static void close(){
        finaly();
    }

}
