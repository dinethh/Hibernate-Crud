/**
 * Author:Dineth Panditha
 * Date :3/1/2023
 * Time :2:32 PM
 * Project Name :Hibernate
 */
package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.Employee;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        /*Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Dineth");
        c1.setAddress("Hikkaduwa");
        c1.setSalary(25000);*/

        /*Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(c1);
        transaction.commit();
        session.close();*/

        /*Customer c2 =new Customer();
        c2.setId("C003");
        c2.setName("Kamal");
        c2.setAddress("Galle");
        c2.setSalary(55000);*/

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // session.save(c2);
        //  session.update(c2);
        // get row
        /*Customer c3=session.get(Customer.class,"C001");
        System.out.println(c3);
        System.out.println(c3.getName()+" - "+c3.getAddress());*/

        //delete  (1)
        /*Customer c2=new Customer();
        c2.setId("C001");
        session.delete(c2);*/

        //delete  (2)
        /*Customer c2=session.get(Customer.class,"C002");
        session.delete(c2);*/

        //===============================================================
        Name name = new Name();
        name.setfName("Ruwan");
        name.setlName("Maduwantha");
        name.setmName("Perera");


        Employee e1 = new Employee();
        e1.setId("E001");
        e1.setName(name);
        e1.setAddress("Colombo");
        session.save(e1);


        transaction.commit();
        session.close();
    }
}
