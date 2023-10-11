package com.example.TestSpringBoot.dao;

import com.example.TestSpringBoot.entities.Committees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CommitteesDAO {
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();

    public void save(Committees customer) {
        try {
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();

            System.out.println("insert success!");
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

//    public void save(Committees committees) {
//        entityManager.getTransaction().begin();
//        entityManager.persist(committees);
//        entityManager.getTransaction().commit();
//    }
//
//    public List<Committees> findAll() {
//        return entityManager.createQuery("select c from committees c", Committees.class).getResultList();
    //}
    public void close() {
        session.flush();
        session.close();
        sessionFactory.close();
    }
}
