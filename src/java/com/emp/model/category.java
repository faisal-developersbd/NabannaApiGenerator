/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.model;

/**
 *
 * @author root
 */
public class category {
    private int cat_id;
    private String cat_name;
    public category()
    {
        
    }
    public category(int cat_id,String cat_name)
    {
        this.cat_id=cat_id;
        this.cat_name=cat_name;
    }
    public void setcat_id(int id)
    {
        this.cat_id=id;
    }
    public int getcat_id()
    {
        return cat_id;
    }
    public void setcat_name(String cat_name)
    {
        this.cat_name=cat_name;
    }
    public String getcat_name()
    {
        return cat_name;
    }
    
    
}
