/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp.ws.request;

import com.gp.ws.data.LoginReceipt;

/**
 *
 * @author rralluri
 */
public class LoginMessage extends BaseMessage{
    private LoginReceipt msg;

    public LoginReceipt getMsg() {
        return msg;
    }

    public void setMsg(LoginReceipt msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "LoginMessage{" + "msg=" + msg + '}';
    }
    
    
}
