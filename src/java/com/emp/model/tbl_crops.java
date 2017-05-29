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
public class tbl_crops {
   private int crop_id;
   private int category_id;
   private String crops;

    public tbl_crops() {
    }

    public tbl_crops(int crop_id, int category_id, String crops) {
        this.crop_id = crop_id;
        this.category_id = category_id;
        this.crops = crops;
    }

    public int getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(int crop_id) {
        this.crop_id = crop_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCrops() {
        return crops;
    }

    public void setCrops(String crops) {
        this.crops = crops;
    }

    @Override
    public String toString() {
        return "tbl_crops{" + "crop_id=" + crop_id + ", category_id=" + category_id + ", crops=" + crops + '}';
    }
    
}
