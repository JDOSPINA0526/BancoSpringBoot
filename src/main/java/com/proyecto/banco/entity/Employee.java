package com.proyecto.banco.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "Email", unique = true)
    private String email;

    @ManyToOne
    private Enterprice enterprice;



    private Date updateAt;
    private Date CreatedAt;

    public Employee (){

    }

    public Employee(Long id, String email, Enterprice enterprice, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.enterprice = enterprice;
        this.updateAt = updateAt;
        CreatedAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprice getEnterprice() {
        return enterprice;
    }

    public void setEnterprice(Enterprice enterprice) {
        this.enterprice = enterprice;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }
}
