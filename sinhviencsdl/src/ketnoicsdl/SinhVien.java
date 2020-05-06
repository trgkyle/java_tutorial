/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;

/**
 *
 * @author truonghdpk
 */
public class SinhVien {
    private String msv;
    private String ten;
    SinhVien(String msv,String ten){
       this.msv = msv;
       this.ten = ten;
    }
    public void xuat(){
        System.out.println(this.msv + ", " + this.ten);
    }
}
