/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.ARTICLE;
import java.util.List;

/**
 *
 * @author kataev2
 */
public interface IRepository {
    
    List<ARTICLE> getAllArticles();
    
    
    void test();
}
