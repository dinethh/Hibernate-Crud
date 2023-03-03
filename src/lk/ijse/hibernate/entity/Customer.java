/**
 * Author:Dineth Panditha
 * Date :3/1/2023
 * Time :3:37 PM
 * Project Name :Hibernate
 */
package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;

    public Customer() {
    }

    public Customer(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*        Annotation(Meta data )
    @Entity   entity class ekak kiyanna
    @Id   primary key ekata ganna
    @Entity(name="customer_details")  table eke name eka change karanna
    @Column(name = "code")    column name ekak change karaganna
    @Transient  Data base eke column ekak hadanna epa
    @CreationTimestamp   (Date date;)   date eka auto table ekata gannawa
    @Embeddable     we have to used it if we want get full name like,
                    we have t creat another package and entity class in to this package
                    its java bean access karaddi variable type ekata class name eka danna
    */
}

