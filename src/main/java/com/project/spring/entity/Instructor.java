package com.project.spring.entity;

//import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="instructor_id")
    private int id;
    @Column(name="instructor_name")
    private String name;
    @Column(name="instructor_exp")
    private int expyears;
    @Column(name="instructor_email")
    private String email;

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

    public int getExpyears() {
        return expyears;
    }

    public void setExpyears(int expyears) {
        this.expyears = expyears;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expyears=" + expyears +
                ", email='" + email + '\'' +
                '}';
    }
}
