package com.login.mongodb.payload.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
  
    private String userid;
 
    private String username;
    
    private Set<String> roles;
 
    private String password;
  
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
    
    public Set<String> getRoles() {
      return this.roles;
    }
    
    public void setRole(Set<String> roles) {
      this.roles = roles;
    }
}
