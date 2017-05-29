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
public class tbl_sai {
    private int id;
    private int crop_id;
    private String sai;
    private float nuf;
    private float nci;
    private float puf;
    private float pci;
    private float suf;
    private float sci;
    private float znuf;
    private float znci;
    private float buf;
    private float bci;

    public tbl_sai() {
    }

    public tbl_sai(int id, int crop_id, String sai, float nuf, float nci, float puf, float pci, float suf, float sci, float znuf, float znci, float buf, float bci) {
        this.id = id;
        this.crop_id = crop_id;
        this.sai = sai;
        this.nuf = nuf;
        this.nci = nci;
        this.puf = puf;
        this.pci = pci;
        this.suf = suf;
        this.sci = sci;
        this.znuf = znuf;
        this.znci = znci;
        this.buf = buf;
        this.bci = bci;
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

    public String getSai() {
        return sai;
    }

    public void setSai(String sai) {
        this.sai = sai;
    }

    public float getNuf() {
        return nuf;
    }

    public void setNuf(float nuf) {
        this.nuf = nuf;
    }

    public float getNci() {
        return nci;
    }

    public void setNci(float nci) {
        this.nci = nci;
    }

    public float getPuf() {
        return puf;
    }

    public void setPuf(float puf) {
        this.puf = puf;
    }

    public float getPci() {
        return pci;
    }

    public void setPci(float pci) {
        this.pci = pci;
    }

    public float getSuf() {
        return suf;
    }

    public void setSuf(float suf) {
        this.suf = suf;
    }

    public float getSci() {
        return sci;
    }

    public void setSci(float sci) {
        this.sci = sci;
    }

    public float getZnuf() {
        return znuf;
    }

    public void setZnuf(float znuf) {
        this.znuf = znuf;
    }

    public float getZnci() {
        return znci;
    }

    public void setZnci(float znci) {
        this.znci = znci;
    }

    public float getBuf() {
        return buf;
    }

    public void setBuf(float buf) {
        this.buf = buf;
    }

    public float getBci() {
        return bci;
    }

    public void setBci(float bci) {
        this.bci = bci;
    }

    @Override
    public String toString() {
        return "tbl_sai{" + "id=" + id + ", crop_id=" + crop_id + ", sai=" + sai + ", nuf=" + nuf + ", nci=" + nci + ", puf=" + puf + ", pci=" + pci + ", suf=" + suf + ", sci=" + sci + ", znuf=" + znuf + ", znci=" + znci + ", buf=" + buf + ", bci=" + bci + '}';
    }
    
}
