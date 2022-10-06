package com.proyecto.banco.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enterprice {

    @Id
    private Long id;

    @OneToMany
    private Employee employee;
}
