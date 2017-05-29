/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.controller;

import com.emp.dao.IapiDao;
import com.emp.model.tbl_category;
import com.emp.model.userInformation;
import com.emp.model.view_stObject;
import com.emp.model.view_ufCiObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author root
 */
@Controller
public class ApiController {
    private final IapiDao api;
    @Autowired
    public ApiController(IapiDao api)
    {
        this.api=api;
        api.setDb();
    }
     @RequestMapping(value="/testView", method = RequestMethod.GET)    
     public ModelAndView testview()
     {
         ModelAndView model=new ModelAndView("myview"); 
         //model.addObject("userInformation",new userInformation());
         List<view_stObject> list=api.getStb("ni", 1);
//         List<view_stObject> list=api.getStb("ni", 1);
//List<view_ufCiObject> list=api.getUfCib("ni", 64, "\'l\'");
         model.addObject("list",list);
         return model;
     }
     @RequestMapping(value="/testinput", method = RequestMethod.GET)    
     public ModelAndView testcontroller()
     {
         ModelAndView model=new ModelAndView("input"); 
         //model.addObject("userInformation",new userInformation());
         //List<view_stObject> list=api.getStb("ni", 1);
//         List<view_stObject> list=api.getStb("ni", 1);
//List<view_ufCiObject> list=api.getUfCib("ni", 64, "\'l\'");
      //   model.addObject("list",list);
         return model;
     }
     
//     String rt="-1";
//String userid=request.getParameter("UID");
//String password=request.getParameter("PWD");
//userInformation userinfo=new userInformation();
//userinfo.setUserID(userid);
//userinfo.setPassword(password);
//
//
//if(uDao.validUser(userinfo))
//        {
//            rt="1";
//        }
//else{
//    rt="-1";
//}
//Map<String,String>map=new HashMap<>();
//map.put("re",rt);
//
//JSONObject obj=new JSONObject();
//obj.putAll(map);
//return obj.toJSONString();
      //Api response methods from here..
    

     @RequestMapping(value="/calCategories", method = RequestMethod.GET)    
    public @ResponseBody String returnCategories(HttpServletRequest request) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       List<tbl_category> list=api.listCategories();
       Map<String,String>map=new HashMap<>();
       int i=0;
       for(tbl_category obj:list)
       {
           map.put("category_id"+i,""+obj.getCategory_id());
           map.put("category_name"+i, obj.getCategory_name());
           i++;
       }
         JSONObject obj=new JSONObject();
         obj.putAll(map);
         return obj.toJSONString();
    }
    
    @RequestMapping(value="/calculation", method = RequestMethod.POST)    
    public @ResponseBody String returncalculation(HttpServletRequest request) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        String check=request.getParameter("check");
//        if(check.equals("check"))
//        {
//            
//        }
        float[] uf=new float[7];
        float[] ci=new float[7];
        float[] ls=new float[7];
        float[] st=new float[7];
        float[] cs=new float[7];
        //get given st value from request 
      st[0]=Float.parseFloat(request.getParameter("stn"));
       st[1]=Float.parseFloat(request.getParameter("stp"));
      st[2]=Float.parseFloat(request.getParameter("stk"));
       st[3]=Float.parseFloat(request.getParameter("sts"));
       st[4]=Float.parseFloat(request.getParameter("stzn"));
       st[6]=Float.parseFloat(request.getParameter("stb"));
        int cropid=Integer.parseInt(""+request.getParameter("cropid"));
        
        
        
       
        
        String[] limits=new String[7];
        //retrive all st list whose soil_id is 1
        
       List<view_stObject> lstn=api.getStn("ni", 1);
       List<view_stObject> lstp=api.getStn("ph", 1);
       List<view_stObject> lstk=api.getStn("ka", 1);
       List<view_stObject> lsts=api.getStn("su", 1);
       List<view_stObject> lstzn=api.getStn("zn", 1);
       List<view_stObject> lstb=api.getStn("bo", 1);
       
       
       
       
       //calculating limits based on current st
       
       int i=0;
       //for nitrozen
       for(view_stObject object:lstn)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //for phosphoras
       for(view_stObject object:lstp)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //for potasium
       for(view_stObject object:lstk)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //for salphur
       for(view_stObject object:lsts)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //for zink
       for(view_stObject object:lstzn)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //for boron
       for(view_stObject object:lstb)
       {
           if(st[i]>=object.getLs())
           {
               cs[i]=object.getCs();
               ls[i]=object.getLs();
               limits[i]=object.getLimits();
               break;
           }
           
       }
       i++;
       //now we have st,ls,cs and their limits
       //now limits will be use for calculating uf and ci based on limits and cropid
       
      i=0; //reset counter
      
      //calculate and retrive all list of ufci
      List<view_ufCiObject> lufcin=api.getUfCin("ni", cropid, limits[i]); i++;
       List<view_ufCiObject> lufcip=api.getUfCip("ph", cropid, limits[i]); i++;
        List<view_ufCiObject> lufcik=api.getUfCik("ka", cropid, limits[i]); i++;
         List<view_ufCiObject> lufcis=api.getUfCis("su", cropid, limits[i]); i++;
          List<view_ufCiObject> lufcizn=api.getUfCizn("zn", cropid, limits[i]); i++;
           List<view_ufCiObject> lufcib=api.getUfCib("bo", cropid, limits[i]); i++;
           
           i=0; //reset counter again
           
           //save uf and ci
      for(view_ufCiObject object:lufcin)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       i++;
       for(view_ufCiObject object:lufcip)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       i++;
       for(view_ufCiObject object:lufcik)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       i++;
       for(view_ufCiObject object:lufcis)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       i++;
       for(view_ufCiObject object:lufcizn)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       i++;
       for(view_ufCiObject object:lufcib)
       {
           uf[i]=object.getUf();
           ci[i]=object.getCi();
       }
       float[] result=new float[7];
       for (i=0;i<6;i++)
       {
           result[i]=uf[i]-(cs[i]/ci[i])*(st[i]-ls[i]);
       }
       
       //creating map
       Map<String,String>map=new HashMap<>();
      i=0;
      String[] nut={"ni","ph","ka","su","zn","bo"};
      
      for(i=0;i<6;i++)
      {
          map.put("result"+nut[i],""+result[i]);
      }
//      map.put("result"+nut[0],""+result[0]);
//       map.put("result"+nut[1],""+result[1]);
//        map.put("result"+nut[2],""+result[2]);
//         map.put("result"+nut[3],""+result[3]);
        
          //convert map to json object
         JSONObject obj=new JSONObject();
         obj.putAll(map);
      //sample json string {resultn,resultp,resultk,results,resultzn,resultb}
        return obj.toJSONString();
    }
    @RequestMapping(value="/callMethods", method = RequestMethod.GET)    
    public @ResponseBody String returnCrops(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @RequestMapping(value="/callSt", method = RequestMethod.GET)    
    public String returnSt(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      @RequestMapping(value="/callUfCi", method = RequestMethod.GET)    
    public String returUfCi(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
