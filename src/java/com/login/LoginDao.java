
package com.login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
    String url = "jdbc:mysql://localhost:3306/loginpage";
    String username = "root";
    String password = "user";
    
    String sql = "selct *from login where uname=? and pass=?";
    
   
    
    public boolean check(String uname,String pass)
    {
        try{
           
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1,uname);
        pst.setString(2,pass);
        
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            return true;
        }
        else{
            return false;
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
        
        return true;
    }
}
