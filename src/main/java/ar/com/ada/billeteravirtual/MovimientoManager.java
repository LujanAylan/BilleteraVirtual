package ar.com.ada.billeteravirtual;

import java.util.logging.Level;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MovimientoManager {
    protected SessionFactory sessionFactory;

    protected void setup() {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
                                                                                                  // from
                                                                                                  // hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }
        
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(movimiento);
  
        session.getTransaction().commit();
        session.close();
    }

    public Movimiento read(int movimientoId) {
        Session session = sessionFactory.openSession();

        Movimiento movimiento = session.get(Movimiento.class, movimientoId);

        session.close();

        return movimiento;
    }

    protected void update(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(movimiento);

        session.getTransaction().commit();
        session.close();
    }

    protected void delete(Movimiento movimiento) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(movimiento);

        session.getTransaction().commit();
        session.close();
    }
}