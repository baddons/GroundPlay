/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp.ws;

import javax.websocket.Session;

/**
 *
 * @author rralluri
 */
public class UserMaster {
    String userName;
    String lastLogin;
    Session session;

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

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "userMaster{" + "userName=" + userName + ", lastLogin=" + lastLogin + '}';
    }
    
    
    
}
