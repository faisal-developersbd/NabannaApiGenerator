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
public class tbl_limits {
    private int id;
    private int soil_id;
    private String limits;
    private float csn;
    private float lsn;
    private float csp;
    private float lsp;
    private float csk;
    private float lsk;
    private float css;
    private float lss;
    private float cszn;
    private float lszn;
    private float csb;
    private float lsb;

    public tbl_limits() {
    }

    public tbl_limits(int id, int soil_id, String limits, float csn, float lsn, float csp, float lsp, float csk, float lsk, float css, float lss, float cszn, float lszn, float csb, float lsb) {
        this.id = id;
        this.soil_id = soil_id;
        this.limits = limits;
        this.csn = csn;
        this.lsn = lsn;
        this.csp = csp;
        this.lsp = lsp;
        this.csk = csk;
        this.lsk = lsk;
        this.css = css;
        this.lss = lss;
        this.cszn = cszn;
        this.lszn = lszn;
        this.csb = csb;
        this.lsb = lsb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoil_id() {
        return soil_id;
    }

    public void setSoil_id(int soil_id) {
        this.soil_id = soil_id;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public float getCsn() {
        return csn;
    }

    public void setCsn(float csn) {
        this.csn = csn;
    }

    public float getLsn() {
        return lsn;
    }

    public void setLsn(float lsn) {
        this.lsn = lsn;
    }

    public float getCsp() {
        return csp;
    }

    public void setCsp(float csp) {
        this.csp = csp;
    }

    public float getLsp() {
        return lsp;
    }

    public void setLsp(float lsp) {
        this.lsp = lsp;
    }

    public float getCsk() {
        return csk;
    }

    public void setCsk(float csk) {
        this.csk = csk;
    }

    public float getLsk() {
        return lsk;
    }

    public void setLsk(float lsk) {
        this.lsk = lsk;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getLss() {
        return lss;
    }

    public void setLss(float lss) {
        this.lss = lss;
    }

    public float getCszn() {
        return cszn;
    }

    public void setCszn(float cszn) {
        this.cszn = cszn;
    }

    public float getLszn() {
        return lszn;
    }

    public void setLszn(float lszn) {
        this.lszn = lszn;
    }

    public float getCsb() {
        return csb;
    }

    public void setCsb(float csb) {
        this.csb = csb;
    }

    public float getLsb() {
        return lsb;
    }

    public void setLsb(float lsb) {
        this.lsb = lsb;
    }

    @Override
    public String toString() {
        return "tbl_limits{" + "id=" + id + ", soil_id=" + soil_id + ", limits=" + limits + ", csn=" + csn + ", lsn=" + lsn + ", csp=" + csp + ", lsp=" + lsp + ", csk=" + csk + ", lsk=" + lsk + ", css=" + css + ", lss=" + lss + ", cszn=" + cszn + ", lszn=" + lszn + ", csb=" + csb + ", lsb=" + lsb + '}';
    }
    
}
