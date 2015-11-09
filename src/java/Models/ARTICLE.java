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
 * @author kataev
 */
@Entity
@Table(name = "ARTICLE")
public class ARTICLE implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int AR_KEY;
    
    @Column(nullable=false)
    private String AR_NAME;
    
    @Column(nullable=false)
    private String AR_CREATE_DATETIME;

    @Column(nullable=false)
    private int AR_ORDERBY;
    
    @Column(nullable=false)
    private int AR_HIDE;

    public ARTICLE() {
    }

    public int getAR_KEY() {
        return AR_KEY;
    }

    public void setAR_KEY(int AR_KEY) {
        this.AR_KEY = AR_KEY;
    }

    public String getAR_NAME() {
        return AR_NAME;
    }

    public void setAR_NAME(String AR_NAME) {
        this.AR_NAME = AR_NAME;
    }

    public String getAR_CREATE_DATETIME() {
        return AR_CREATE_DATETIME;
    }

    public void setAR_CREATE_DATETIME(String AR_CREATE_DATETIME) {
        this.AR_CREATE_DATETIME = AR_CREATE_DATETIME;
    }

    public int getAR_ORDERBY() {
        return AR_ORDERBY;
    }

    public void setAR_ORDERBY(int AR_ORDERBY) {
        this.AR_ORDERBY = AR_ORDERBY;
    }

    public int getAR_HIDE() {
        return AR_HIDE;
    }

    public void setAR_HIDE(int AR_HIDE) {
        this.AR_HIDE = AR_HIDE;
    }
    

}
