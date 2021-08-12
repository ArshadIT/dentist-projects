package com.denstistservice.entity;

import lombok.Data;


import javax.persistence.*;

import java.util.Set;

@Entity
@Data
public class User {
    @Id
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)      // we need to user and role association
    @JoinTable(name = "USER_ROLE", joinColumns = {@JoinColumn(name = "USER_ID")}, inverseJoinColumns = {@JoinColumn(name = "ROLE_ID")})
    private Set<Role> roles;   // one user has many roles


}
