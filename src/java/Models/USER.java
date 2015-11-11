/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author kataev2
 */
@Entity
@Table(name = "USER")
public class USER implements Serializable {

    public USER() {
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int US_KEY;
    
    @Column(name = "US_NAME", nullable=false)
    private String US_NAME;
    
    @Column(nullable=false)
    private String US_PASSWORD;
    
    @Column(nullable=false)
    private int US_ADMIN;
    
    @Column(nullable=false)
    private int US_HIDE;

    public int getUS_KEY() {
        return US_KEY;
    }

    public void setUS_KEY(int US_KEY) {
        this.US_KEY = US_KEY;
    }

    public String getUS_NAME() {
        return US_NAME;
    }

    public void setUS_NAME(String US_NAME) {
        this.US_NAME = US_NAME;
    }

    public String getUS_PASSWORD() {
        return US_PASSWORD;
    }

    public void setUS_PASSWORD(String US_PASSWORD) {
        this.US_PASSWORD = US_PASSWORD;
    }

    public int getUS_ADMIN() {
        return US_ADMIN;
    }

    public void setUS_ADMIN(int US_ADMIN) {
        this.US_ADMIN = US_ADMIN;
    }

    public int getUS_HIDE() {
        return US_HIDE;
    }

    public void setUS_HIDE(int US_HIDE) {
        this.US_HIDE = US_HIDE;
    }
}
