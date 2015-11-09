/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Helpers.SimpleHelper;
import Models.ARTICLE;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author kataev2
 */
public class ClassesFactory {
    
    public static ARTICLE getArticle(HttpServletRequest request){
        ARTICLE result = new ARTICLE();
        
        try {
            result.setAR_KEY(Integer.parseInt(request.getParameter("AR_KEY")));
            result.setAR_NAME(request.getParameter("AR_NAME"));
            result.setAR_CREATE_DATETIME(SimpleHelper.getToDay());
            result.setAR_ORDERBY(Integer.parseInt(request.getParameter("AR_ORDERBY")));
            
            if(request.getParameter("AR_HIDE") == null)
                result.setAR_HIDE(0);
            else
                result.setAR_HIDE(Integer.parseInt(request.getParameter("AR_HIDE")));
        } catch (Exception e) {
            return null;
        }
        
        return result;
    }
    
}
