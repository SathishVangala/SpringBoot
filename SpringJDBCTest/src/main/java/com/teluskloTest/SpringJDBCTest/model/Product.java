package com.teluskloTest.SpringJDBCTest.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
@Component
@Scope("prototype")
public class Product {

    private int pID;
    private String pName;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
    @Override
    public String toString() {
        return "Student [pId=" + pID + ", pname=" + pName + ", loacation=" + location + "]";
    }
}
