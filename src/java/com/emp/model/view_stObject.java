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
public class view_stObject {
   private String nutritions;
   private String limits;
   private float cs;
   private float ls;

    @Override
    public String toString() {
        return "view_stObject{" + "nutritions=" + nutritions + ", limits=" + limits + ", cs=" + cs + ", ls=" + ls + '}';
    }

    public String getNutritions() {
        return nutritions;
    }

    public void setNutritions(String nutritions) {
        this.nutritions = nutritions;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public float getCs() {
        return cs;
    }

    public void setCs(float cs) {
        this.cs = cs;
    }

    public float getLs() {
        return ls;
    }

    public void setLs(float ls) {
        this.ls = ls;
    }

    public view_stObject() {
    }

    public view_stObject(String nutritions, String limits, float cs, float ls) {
        this.nutritions = nutritions;
        this.limits = limits;
        this.cs = cs;
        this.ls = ls;
    }

    
}
