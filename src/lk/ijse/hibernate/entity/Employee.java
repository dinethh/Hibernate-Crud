package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author:Dineth Panditha
 * Date  :3/3/2023
 * Time  :11:46 AM
 * Name  :Hibernate
 */
@Entity
public class Employee {
    @Id
    String id;
    Name name;
    String address;

    public Employee() {
    }

    public Employee(String id, Name name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  Name getName() {
        return name;
    }

    public void setName( Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }
}
