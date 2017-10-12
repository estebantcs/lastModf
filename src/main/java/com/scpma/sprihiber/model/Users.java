package com.scpma.sprihiber.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GenericGenerator(name = "increment",strategy = "increment")
    @GeneratedValue(generator = "increment")
    private long id;
    private String name;
    private String rol;

}
