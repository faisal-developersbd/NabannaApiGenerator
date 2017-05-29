/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.model;

public class userInformation {
private String id;
private String password;
private String name;
public userInformation() {
}
public userInformation(String name, String password) {
this.name = name;
this.id=id;
this.password = password;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}
public String getUserID() {
return id;
}
public void setUserID(String id) {
this.id = id;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
}
