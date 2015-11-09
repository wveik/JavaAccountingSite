/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author kataev2
 */
public class SimpleHelper {
    
    public static String getToDay(){
        String DATE_FORMAT_NOW = "dd-MM-yyyy HH:mm:ss";

        //Instance of the calender class in the utill package
        Calendar cal = Calendar.getInstance(); 

        //A class that was used to get the date time stamp
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW); 
        
        return sdf.format(cal.getTime());
    }
    
    public static String getRootURL(HttpServletRequest request){
        String baseUrl = "";
        
        if ( ( request.getServerPort() == 80 ) ||
         ( request.getServerPort() == 443 ) )
        baseUrl =
          request.getScheme() + "://" +
          request.getServerName() +
          request.getContextPath();
      else
        baseUrl =
          request.getScheme() + "://" +
          request.getServerName() + ":" + request.getServerPort() +
          request.getContextPath();
        
        return baseUrl;
    }
    
}
