package test;

import java.util.Scanner;
public class SinhVien1 {
    String ten;
    int tuoi;
    public  void setTen(String t) throws Exception {
        if (t.trim().equals("")) {
            throw new   Exception("Ten khong duoc de trong...");
        } else
        ten = t;
    }
    void setTuoi(int t) throws Exception {
        if (t <= 0) { 
            throw new Exception("Tuoi phai > 0 ");
        } else
        tuoi = t;
    }
    void nhap() {//bắt lỗi lan truyền nếu có gọi đến 2 hàm set
        while (true) { //lặp lại nhập cho đến khi nào đúng dữ liệu
            try {              
                Scanner s = new Scanner(System.in);
                System.out.print("Nhap Ten: ");
                setTen(s.nextLine());
                System.out.print("Nhap Tuoi : ");
                setTuoi(s.nextInt()); 
                break;//thoát lặp nếu dl nhập đúng
        } catch (Exception ex) {
            System.out.print(ex.toString()+"\n");
        }
    }
 }
    
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", tuoi=" + tuoi + '}';
    }

    public static void main(String[] args) {
         SinhVien1 v=new SinhVien1();
         v.nhap();
         System.out.print(v);
    }
}
