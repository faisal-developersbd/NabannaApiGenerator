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
public class crops {
    private int crop_id;
    private int cat_id;
    private String crop_name;
    public crops()
    {
        
    }
    public crops(int crop_id,int at_id,String crop_name){
        this.cat_id=crop_id;
        this.cat_id=cat_id;
        this.crop_name=crop_name;
    }
    public int getcrop_id()
    {
        return crop_id;
    }
    public void setcrop_id(int crop_id)
    {
        this.crop_id=crop_id;
    }
    public int getcat_id()
    {
        return cat_id;
    }
    public void setcat_id(int cat_id)
    {
      this.cat_id=cat_id;   
    }
    public String getcrop_name()
    {
        return crop_name;
    }
    public void setcrop_name(String crop_name)
    {
        this.crop_name=crop_name;
    }
}
