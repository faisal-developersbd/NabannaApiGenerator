/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.model.category;
import com.emp.model.tbl_category;
import com.emp.model.tbl_crops;
import com.emp.model.view_stObject;
import com.emp.model.view_ufCiObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author root
 */
@Repository
@Transactional
public class apiDaoImpl implements IapiDao{
   private JdbcTemplate jdbcTemplate;
    @Override
    public void setDb() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
           DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/fertilizer");
        dataSource.setUsername("faisal");
        dataSource.setPassword("1234");
        this.jdbcTemplate = new JdbcTemplate(dataSource);  
        }catch(Exception e)
        {
           System. out.println("Error");
        }
       
       
    }

    @Override
    public List<tbl_category> listCategories() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     String sql="select * from tbl_category";
   List<tbl_category> listOfCategory= jdbcTemplate.query(sql, new RowMapper<tbl_category>() {
         @Override
         public tbl_category mapRow(ResultSet rs, int i) throws SQLException {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            tbl_category repository=new tbl_category();
            repository.setCategory_id(rs.getInt("category_id"));
            repository.setCategory_name(rs.getString("category_name"));
             return repository;
         }

        
     });
   return listOfCategory;
    }

    @Override
    public List<tbl_crops> listSpecifcCrops(int category_id){
        String sql="SELECT * FROM tbl_crops WHERE category_id="+category_id;
       // jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class)); 
//       jdbcTemplate.queryForObject(sql, new Object[]{category_id},new BeanPropertyRowMapper<tbl_crops>(tbl_crops.class));
       //jdbcTemplate.queryForObject(sql,new Object[]{category_id},new BeanPropertyRowMapper<tbl_crops>(tbl_category.class));
    List<tbl_crops> listOfCrops=jdbcTemplate.query(sql,new RowMapper<tbl_crops>() {
            @Override
            public tbl_crops mapRow(ResultSet rs, int i) throws SQLException {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tbl_crops repository=new tbl_crops();
               repository.setCategory_id(rs.getInt("category_id"));
               repository.setCrop_id(rs.getInt("crop_id"));
               repository.setCrops(rs.getString("crops"));
               return repository;
            }
        });
    return listOfCrops;
    }

    @Override
    public List<view_stObject> getStn(String nutrition, int soilId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String sql="SELECT limits,csn,lsn from tbl_limits where soil_Id="+soilId+" order by lsn desc";
    List<view_stObject> listOfNi=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("csn"));
            repository.setLs(rs.getFloat("lsn"));
            return repository;
        }
    });
    return listOfNi;
    }

    @Override
    public List<view_stObject> getStp(String nutrition, int soilId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String sql="SELECT limits,csp,lsp from tbl_limits where soil_Id="+soilId+" order by lsp desc";
    List<view_stObject> listOfPh=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("csp"));
            repository.setLs(rs.getFloat("lsp"));
            return repository;
        }
    });
    return listOfPh;
    }

    @Override
    public List<view_stObject> getStk(String nutrition, int soilId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     String sql="SELECT limits,csk,lsk from tbl_limits where soil_Id="+soilId+" order by lsk desc";
    List<view_stObject> listOfKa=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("csk"));
            repository.setLs(rs.getFloat("lsk"));
            return repository;
        }
    });
    return listOfKa;
    }

    @Override
    public List<view_stObject> getSts(String nutrition, int soilId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql="SELECT limits,css,lss from tbl_limits where soil_Id="+soilId+" order by lss desc";
    List<view_stObject> listOfSu=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("css"));
            repository.setLs(rs.getFloat("lss"));
            return repository;
        }
    });
    return listOfSu;
    }
    @Override
    public List<view_stObject> getStzn(String nutrition, int soilId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String sql="SELECT limits,cszn,lszn from tbl_limits where soil_Id="+soilId+" order by lszn desc";
    List<view_stObject> listOfZn=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("cszn"));
            repository.setLs(rs.getFloat("lszn"));
            return repository;
        }
    });
    return listOfZn;
    }

    @Override
    public List<view_stObject> getStb(String nutrition, int soilId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     String sql="SELECT limits,csb,lsb from tbl_limits where soil_Id="+soilId+" order by lsb desc";
    List<view_stObject> listOfBo=jdbcTemplate.query(sql,new RowMapper<view_stObject>() {
        @Override
        public view_stObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_stObject repository=new view_stObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("limits"));
            repository.setCs(rs.getFloat("csb"));
            repository.setLs(rs.getFloat("lsb"));
            return repository;
        }
    });
    return listOfBo;
    }

    @Override
    public List<view_ufCiObject> getUfCin(String nutrition, int cropId, String sai) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfNi=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("nuf"));
            repository.setCi(rs.getFloat("nci"));
            return repository;
        }
    });
       // String sql="SELECT nuf,nci from tbl_sai where sai=? and crop_id=?";  
       // return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<view_ufCiObject>(view_ufCiObject.class));
    return listOfNi;
    }

    @Override
    public List<view_ufCiObject> getUfCip(String nutrition, int cropId, String sai) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfPh=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("puf"));
            repository.setCi(rs.getFloat("pci"));
            return repository;
        }
    });
    return listOfPh;
    }

    @Override
    public List<view_ufCiObject> getUfCik(String nutrition, int cropId, String sai) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfKa=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("kuf"));
            repository.setCi(rs.getFloat("kci"));
            return repository;
        }
    });
    return listOfKa;
    }

    @Override
    public List<view_ufCiObject> getUfCis(String nutrition, int cropId, String sai) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfSu=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("suf"));
            repository.setCi(rs.getFloat("sci"));
            return repository;
        }
    });
    return listOfSu;
    }

    @Override
    public List<view_ufCiObject> getUfCizn(String nutrition, int cropId, String sai) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfZn=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("znuf"));
            repository.setCi(rs.getFloat("znci"));
            return repository;
        }
    });
    return listOfZn;
       
    }

    @Override
    public List<view_ufCiObject> getUfCib(String nutrition, int cropId, String sai) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   String sql="SELECT * from tbl_sai WHERE sai='"+sai+"' and crop_id="+cropId;
    List<view_ufCiObject> listOfBo=jdbcTemplate.query(sql,new RowMapper<view_ufCiObject>() {
        @Override
        public view_ufCiObject mapRow(ResultSet rs, int i) throws SQLException {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            view_ufCiObject repository=new view_ufCiObject();
            repository.setNutritions(nutrition);
            repository.setLimits(rs.getString("sai"));
            repository.setUf(rs.getFloat("buf"));
            repository.setCi(rs.getFloat("bci"));
            return repository;
        }
    });
    return listOfBo;
    }
    
   

  
   
    
    
}
