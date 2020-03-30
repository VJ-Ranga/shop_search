package com.shop.domain;
// Generated Mar 30, 2020 7:29:02 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserDetails generated by hbm2java
 */
public class UserDetails  implements java.io.Serializable {


     private Integer id;
     private UserLevel userLevel;
     private String fisrtName;
     private String lastName;
     private String username;
     private String password;
     private String email;
     private String userDetailscol;
     private String status;
     private Date createdDate;
     private Set<Shop> shops = new HashSet<Shop>(0);

    public UserDetails() {
    }

	
    public UserDetails(UserLevel userLevel) {
        this.userLevel = userLevel;
    }
    public UserDetails(UserLevel userLevel, String fisrtName, String lastName, String username, String password, String email, String userDetailscol, String status, Date createdDate, Set<Shop> shops) {
       this.userLevel = userLevel;
       this.fisrtName = fisrtName;
       this.lastName = lastName;
       this.username = username;
       this.password = password;
       this.email = email;
       this.userDetailscol = userDetailscol;
       this.status = status;
       this.createdDate = createdDate;
       this.shops = shops;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public UserLevel getUserLevel() {
        return this.userLevel;
    }
    
    public void setUserLevel(UserLevel userLevel) {
        this.userLevel = userLevel;
    }
    public String getFisrtName() {
        return this.fisrtName;
    }
    
    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserDetailscol() {
        return this.userDetailscol;
    }
    
    public void setUserDetailscol(String userDetailscol) {
        this.userDetailscol = userDetailscol;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Set<Shop> getShops() {
        return this.shops;
    }
    
    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }




}

