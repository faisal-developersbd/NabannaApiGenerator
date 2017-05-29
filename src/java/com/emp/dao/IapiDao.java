/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.model.tbl_category;
import com.emp.model.tbl_crops;
import com.emp.model.tbl_limits;
import com.emp.model.tbl_sai;
import com.emp.model.view_stObject;
import com.emp.model.view_ufCiObject;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author root
 */
public interface IapiDao {
   public void setDb();
   public List<tbl_category> listCategories();
   public List<tbl_crops> listSpecifcCrops(int category_id);
   public List<view_stObject> getStn(String nutrition,int soilId);
   public List<view_stObject> getStp(String nutrition,int soilId);
   public List<view_stObject> getStk(String nutrition,int soilId);
   public List<view_stObject> getSts(String nutrition,int soilId);
   public List<view_stObject> getStzn(String nutrition,int soilId);
   public List<view_stObject> getStb(String nutrition,int soilId);
   
   public List<view_ufCiObject> getUfCin(String nutrition,int cropId,String sai);
   public List<view_ufCiObject> getUfCip(String nutrition,int cropId,String sai);
   public List<view_ufCiObject> getUfCik(String nutrition,int cropId,String sai);
   public List<view_ufCiObject> getUfCis(String nutrition,int cropId,String sai);
   public List<view_ufCiObject> getUfCizn(String nutrition,int cropId,String sai);
   public List<view_ufCiObject> getUfCib(String nutrition,int cropId,String sai);
   

}
