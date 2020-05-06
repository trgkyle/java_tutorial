/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo__derby;

import java.sql.ResultSet;

/**
 *
 * @author TONG LE TU VAN
 */
public class Demo__Derby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Connect cn=new Connect();
        cn.getConnect();
        ResultSet r;
        int t;
        
        //select
        
        r=cn.executeQuery("Select * from HCN");
        while(r.next())
        {
            System.out.println(r.getString("ID") + "  " + r.getDouble("CHIEUDAI") 
                    + "  " + r.getDouble("CHIEURONG")+ "  " + r.getDouble("DIENTICH"));
        }
        
        //insert
        
        /*t=cn.executeUpdate("insert into HCN values('v10',6,7,42)");
        cn.getConnect();
        r=cn.executeQuery("select * from HCN ");
        while(r.next())
        {
            System.out.println(r.getString("ID") + "  " + r.getDouble("CHIEUDAI") 
                    + "  " + r.getDouble("CHIEURONG")+ "  " + r.getDouble("DIENTICH"));
        }*/
        
        //delete
        
        /* t=cn.executeUpdate("Delete from HCN where ID='v10'");
        cn.getConnect();
        r=cn.executeQuery("select * from HCN ");
        while(r.next())
        {
            System.out.println(r.getString("ID") + "  " + r.getDouble("CHIEUDAI") 
                    + "  " + r.getDouble("CHIEURONG")+ "  " + r.getDouble("DIENTICH"));
        }*/
        
        //update
        
        /*t=cn.executeUpdate("update HCN set CHIEUDAI=5 where ID='v2'");
        cn.getConnect();
        t=cn.executeUpdate("update HCN set DIENTICH=CHIEUDAI*CHIEURONG where ID='v2'");
        cn.getConnect();
        r=cn.executeQuery("select * from HCN ");
        while(r.next())
        {
            System.out.println(r.getString("ID") + "  " + r.getDouble("CHIEUDAI") 
                    + "  " + r.getDouble("CHIEURONG")+ "  " + r.getDouble("DIENTICH"));
        }*/
        cn.closeConnect();
    }
    
}
