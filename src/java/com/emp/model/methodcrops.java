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
public class methodcrops {
    
    private int crop_id;
    private int cat_id;
    private String crop_name;
    private int method_id;
    private String method_name;
    
    public methodcrops()
    {
        
    }
    public methodcrops(int crop_id,int cat_id,String crop_name,int method_id,String method_name)
    {
        this.crop_id=crop_id;
        this.cat_id=cat_id;
        this.crop_name=crop_name;
        this.method_id=method_id;
        this.method_name=method_name;
    }
    public int getcrop_id()
    {
        return crop_id;
    }
    public int getcat_id()
    {
        return cat_id;
    }
    public String getcrop_name()
    {
        return crop_name;
    }
    public int getmethod_id()
    {
        return method_id;
    }
    public String getmethod_name()
    {
        return method_name;
    }
    public void setcrop_id(int crop_id)
    {
        this.crop_id=crop_id;
    }
    public void setcat_id(int cat_id)
    {
        this.cat_id=cat_id;
    }
    public void setcrop_name(String crop_name)
    {
        this.crop_name=crop_name;
    }
    public void setmethod_id(int method_id)
    {
        this.method_id=method_id;
    }
    public void setmethod_name(String method_name)
    {
        this.method_name=method_name;
    }
    
}
