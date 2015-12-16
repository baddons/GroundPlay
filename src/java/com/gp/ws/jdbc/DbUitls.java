/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gp.ws.jdbc;

import com.mysql.jdbc.Connection;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rralluri
 */
public class DbUitls {
    public Connection getConnection() throws SQLException {

    Connection conn = null;
    Properties connectionProps = new Properties();
     InputStream input = null;
    try{
//     input = new FileInputStream("application.properties");
     input = getClass().getClassLoader().getResourceAsStream("application.properties");
     
//     connectionProps.load(input);
     connectionProps.load(input);
       String dbServer= connectionProps.getProperty("serverName");
       String dbPort= connectionProps.getProperty("port");
       String dbName= connectionProps.getProperty("database");
       String dbUser= connectionProps.getProperty("dbuser");
       String dbPassword= connectionProps.getProperty("dbpassword");
        System.out.println(  "jdbc:mysql://" +
                   dbServer +
                   ":" + dbPort + "/" +dbName +"?user="+dbUser+"&password="+dbPassword);
        conn = (Connection) DriverManager.getConnection(
                   "jdbc:mysql://" +
                   dbServer +
                   ":" + dbPort + "/" +dbName +"?user="+dbUser+"&password="+dbPassword);
        System.out.println("connections  " + conn) ;
    System.out.println("Connected to database");
    }catch(Exception e){
        e.printStackTrace();
    }finally{
   
    return conn;
    }
}
    public static void main(String[] arg){
        
        DbUitls util = new DbUitls();
        try {
            Connection cn= util.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbUitls.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
