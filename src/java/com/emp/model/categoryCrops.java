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
public class categoryCrops {
    private int crop_id;
    private String  cat_name;
    private String crop_name;
    public categoryCrops(){
    
}
    public categoryCrops(int crop_id,String cat_name,String crop_name)
    {
        this.crop_id=crop_id;
        this.cat_name=cat_name;
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
    public String getcat_name()
    {
        return cat_name;
    }
    public void setcat_name(String cat_name)
    {
        this.cat_name=cat_name;
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
