/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp.ws;

/**
 *
 * @author rralluri
 */
public class userMaster {
    String userName;
    String lastLogin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "userMaster{" + "userName=" + userName + ", lastLogin=" + lastLogin + '}';
    }
    
    
    
}
