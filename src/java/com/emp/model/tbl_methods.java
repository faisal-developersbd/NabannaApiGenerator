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
public class tbl_methods {
    private int id;
    private int crop_id;
    private String methods;

    public tbl_methods() {
    }

    public tbl_methods(int id, int crop_id, String methods) {
        this.id = id;
        this.crop_id = crop_id;
        this.methods = methods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(int crop_id) {
        this.crop_id = crop_id;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    @Override
    public String toString() {
        return "tbl_methods{" + "id=" + id + ", crop_id=" + crop_id + ", methods=" + methods + '}';
    }
    
}
