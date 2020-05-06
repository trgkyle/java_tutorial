/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

abstract class NhanVien {

    protected String maNv;
    protected String hoTen;
    protected int namVaoLam;
    protected float phuCap;
    protected float luong;

    abstract public float tinhLuong();
    static double tongLuong;

    protected float tinhPhuCap() {
        Date now = new Date();
        int d = LocalDate.now().getYear();
        return phuCap + (d - namVaoLam) * 20000;
    }

    public NhanVien(String maNv) {
        this.maNv = maNv;
        this.hoTen = "";
        this.namVaoLam = 2012;
        luong = 0f;
        phuCap = 100000f;
    }

    public NhanVien() {
        this.maNv = "nv0";
        this.hoTen = "";
        this.namVaoLam = 2000;
        luong = 0f;
        phuCap = 100000f;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nv =");
        maNv = s.nextLine();
        System.out.print("Nhap ho ten=");
        hoTen = s.nextLine();
        System.out.print("Nhap nam vao lam=");
        namVaoLam = s.nextInt();
        phuCap = tinhPhuCap();
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-15s %6s ", " Ma nv", " ho ten", "năm vào làm");
    }

    public void xuatDL() {
        System.out.printf("%-10s %-15s %6d ", maNv, hoTen, namVaoLam);
    }

    public String getMaNv() {
        return maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public float getLuong() {
        return luong;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

}
