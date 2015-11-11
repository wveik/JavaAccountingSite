/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Interface.IRepository;
import Models.ARTICLE;
import Models.USER;
import java.util.List;
import org.hibernate.Query;
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
    public void SaveArticle(ARTICLE article) {
        Before();
        
        session.save(article);
        session.flush();
        
        After();
    }

    @Override
    public Boolean IsAdmin(String login, String password) {
        
        Before();
        
        Query query = session.createQuery("from USER as u where 1=1" 
                + " and u.US_NAME = ?"
                + " and u.US_PASSWORD = ?"   
                + " and u.US_ADMIN = ?"
                + " and u.US_HIDE = ?"
        )
                .setString(0, login)
                .setString(1, password)
                .setInteger(2, 1)
                .setInteger(3, 0)
        ;

        List<USER> list = query.list();
        
        After();
        
        return list.size() > 0;
    }

}
