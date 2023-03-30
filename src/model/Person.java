/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author invitado
 */
public class Person {
    private int id;
    private String name;
    private String address;
    private String lastName;

    public Person(int id, String name, String lastNmae, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }
      
}

