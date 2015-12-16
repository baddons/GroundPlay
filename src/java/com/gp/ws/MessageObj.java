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
public class MessageObj {
  private String type;
  private Object msg;
  private int callback_id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public int getCallback_id() {
        return callback_id;
    }

    public void setCallback_id(int callback_id) {
        this.callback_id = callback_id;
    }

    @Override
    public String toString() {
        return "messageobj{" + "type=" + type + ", msg=" + msg + ", callback_id=" + callback_id + '}';
    }
  
  
    
}
