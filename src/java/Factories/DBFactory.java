/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Interface.IRepository;
import Repositories.Repository;

/**
 *
 * @author kataev2
 */
public class DBFactory {
    public static IRepository GetDBRepository(){
        IRepository result = new Repository();
        
        return result;
    }
}
