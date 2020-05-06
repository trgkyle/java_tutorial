/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

/**
 *
 * @author VuVu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VuVu
 */
public class Database {
    private final String DB_Driver="org.apache.derby.jdbc.ClientDriver";
    private final String DB_Url="jdbc:derby://localhost:1527/SINHVIEN";
    private final String DB_User="SINHVIEN";
    private final String DB_Pass="123";
    
    private Connection cnn=null;
    private ResultSet rs=null;
    
    public Database(){
        try {
            //đăng ký driver
            
            Class.forName(DB_Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //mở kết nối
    private Connection openConnection(){
        try {
            cnn=DriverManager.getConnection(DB_Url,DB_User,DB_Pass);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
        
        
    }
    //đóng kết nối
    private void closeConnection(){
        try {
            if(rs !=null){
            rs.close();
            }
            if(cnn!= null)
            {
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //thực thi truy vấn thêm sinh viên vào csdl
    public int themSinhVien(int ID,String tenSinhVien){
        int affectedRow=0;
        String insertSQL="INSERT INTO TTSV(ID,TEN_SV)VALUES(?,?)";
        
        try {
            openConnection();
            PreparedStatement preStmt= cnn.prepareStatement(insertSQL);
             preStmt.setInt(1, ID);
             preStmt.setString(2, tenSinhVien);
             affectedRow=preStmt.executeUpdate();
             closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return affectedRow;
    
    }
    //sửa
    
     public int sua(int ID,String tenSinhVien){
        int affectedRow=0;
        String updateSQL="UPDATE TTSV SET TEN_SV=? WHERE ID=?";
        try {
            openConnection();
            PreparedStatement preStmt=cnn.prepareStatement(updateSQL);
              preStmt.setString(1, tenSinhVien);
             preStmt.setInt(2, ID);
          
             
             affectedRow=preStmt.executeUpdate();
             closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        return affectedRow;
    }
     //xóa
      public int xoa(int ID){
        int affectedRow=0;
        String deleteSQL="DELETE FROM TTSV WHERE ID=?";
        try {
             openConnection();
            PreparedStatement preStmt=cnn.prepareStatement(deleteSQL);
          
             preStmt.setInt(1, ID);
          
            
             affectedRow=preStmt.executeUpdate();
             closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        return affectedRow;
    }  
      
      //tìm sinh viên
      
       public ArrayList tim(int ID){
       ArrayList<String> pTs=new ArrayList<>();
        String findSQL="SELECT * FROM TTSV WHERE ID=? ";
        String[] arrs;
        try {
            openConnection();
            PreparedStatement preStmt=cnn.prepareStatement(findSQL);
          
             preStmt.setInt(1, ID);
             
             rs=preStmt.executeQuery();
             while(rs.next())
             {
                 pTs.add(rs.getInt("ID")+","+rs.getString("TEN_SV"));
             }
             
            
             closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return pTs;
    }  
      //lấy sinh viên vừa nhập
      public ArrayList LayTatCaSV() {
          ArrayList<String> pTs=new ArrayList<>();
          String getAllSQL="SELECT * FROM TTSV";
          try{
              openConnection();
         Statement stmt= cnn.createStatement();
         
          rs=stmt.executeQuery(getAllSQL);
          while(rs.next())
              pTs.add(rs.getInt("ID")+","+rs.getString("TEN_SV"));
          closeConnection();
          }catch(SQLException ex)
          {
             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             
          }
                  
        return pTs;
          
          }
    
}
