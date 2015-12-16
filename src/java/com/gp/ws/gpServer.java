/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp.ws;

import com.gp.ws.request.LoginMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * 
 */
@ServerEndpoint("/gpServer") 
public class gpServer {
    public static HashMap<String,UserMaster> sessionManager = new HashMap<>();
     @OnOpen
    public void onOpen(Session session){
        System.out.println(session.getId() + " has opened a connection"); 
        try {
            session.getBasicRemote().sendText("Connection Established");
            sessionManager.put(session.getId(), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     @OnMessage
    public void onMessage(String message, Session session){
        System.out.println("Message from " + session.getId() + ": " + message);
         ObjectMapper mapper = new ObjectMapper();
        try {
             LoginMessage lm=null;
            MessageObj msg = mapper.readValue(message, MessageObj.class);
            System.out.println("Login map :  " + msg);
//            Testing Login Users
           if(msg.getType().equalsIgnoreCase("login")){
             lm=mapper.readValue(message,LoginMessage.class);
                UserMaster user=new UserMaster();
                user.setUserName(lm.getMsg().getUserName());
               sessionManager.put(session.getId(), user);
           }else{
               
           }
             
            
            System.out.println("Login message " +  lm.toString());
        } catch (IOException ex) {
            Logger.getLogger(gpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
      @OnClose
    public void onClose(Session session){
        System.out.println("Session " +session.getId()+" has ended");
    }
}
