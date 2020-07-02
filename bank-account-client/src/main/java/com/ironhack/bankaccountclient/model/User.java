package com.ironhack.bankaccountclient.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Integer id;
    protected String username;
    protected String password;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="user")
    protected Set<Role> roles = new HashSet<>();

}
