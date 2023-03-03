/**
 * Author:Dineth Panditha
 * Date :3/1/2023
 * Time :3:26 PM
 * Project Name :Hibernate
 */
package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure().
                                        addAnnotatedClass(Customer.class).addAnnotatedClass(Employee.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
