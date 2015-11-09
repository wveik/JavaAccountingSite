/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Interface.IRepository;
import Models.ARTICLE;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author kataev2
 */
public class Repository implements IRepository {

    private SessionFactory sessionFactory;
    private ServiceRegistry serviceRegistry;
    private Configuration configuration;
    private Session session; 
    
    private void Before(){
        configuration = new Configuration();
        
        configuration.configure();
        configuration.setProperty("hibernate.connection.url", "jdbc:sqlite:" + this.getClass().getResource("/") + "accounting.db");        

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        session = sessionFactory.openSession();
        session.beginTransaction();
    }
    
    private void After(){
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    @Override
    public List<ARTICLE> getAllArticles() {
        Before();
        
        List<ARTICLE> result = session.createQuery("from ARTICLE").list();
        
        After();
        return result;
    }

    @Override
    public void test() {
        Before();
        
        
        After();
    }
    
}
