package com.login.mongodb.models;

import java.util.HashSet;
import java.util.Set;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users2")
public class User {
  @Id
  private String id;

  private String userid;

  private String username;

  private String password;

  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String userid, String username, String password) {
    this.userid = userid;
    this.username = username;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getuserid() {
    return userid;
  }

  public void setuserid(String userid) {
    this.userid = userid;
  }

  public String getusername() {
    return username;
  }

  public void setusername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}
