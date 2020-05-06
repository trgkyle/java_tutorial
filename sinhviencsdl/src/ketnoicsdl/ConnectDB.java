/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectDB {

    Statement  stm = null;
    ResultSet rs = null;
    Connection cnn = null;
   
    String uRl = "jdbc:derby://localhost:1527/QLSinhVien";//;create=true";
    String userName = "APP";// chema mặc định
    String pas = "12345";
    //CREATE SCHEMA <schema name>
    //jdbc:derby://localhost:1527/ktpm3 [ABC on ABC]
    public ConnectDB() {
        try {         
           //org.apache.derby.jdbc.ClientDriver
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            cnn = DriverManager.getConnection(uRl, userName,pas);    
            System.out.println("ket noi thanh cong");
        } catch (Exception ex) {
            System.out.println("ket noi that bai"+ ex.toString());
        }
    }   
 public void doSQL(String sql)  {
        try {
            stm = cnn.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n"+sql);
        }
     
 }
 public ArrayList getData(String sql)  {
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        try {
                stm =   (Statement) cnn.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    SinhVien sv = new SinhVien(rs.getString(1), rs.getString(2));
                    ds.add(sv);                        
                }                                
        } catch (Exception ex) {           
            System.out.println("loi getData "+ ex.toString());
            return null;
        }
        return ds;
    }  
}
