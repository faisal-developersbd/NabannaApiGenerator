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
public class view_ufCiObject {
    private String nutritions;
    private String limits;
    private float uf;
    private float ci;

    public view_ufCiObject() {
    }

    public view_ufCiObject(String nutritions, String limits, float uf, float ci) {
        this.nutritions = nutritions;
        this.limits = limits;
        this.uf = uf;
        this.ci = ci;
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

    public float getUf() {
        return uf;
    }

    public void setUf(float uf) {
        this.uf = uf;
    }

    public float getCi() {
        return ci;
    }

    public void setCi(float ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "view_ufCiObject{" + "nutritions=" + nutritions + ", limits=" + limits + ", uf=" + uf + ", ci=" + ci + '}';
    }
    
    
}
