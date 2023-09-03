package com.cpy_project3_SS.SSdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    
    @Id
    private int id;
    private String username;
    private String password;
    private String roles;

    @Override
    public String toString() {
        return "User [id=" + id + ", password=" + password + ", roles=" + roles + ", username=" + username + "]";
    }


}
