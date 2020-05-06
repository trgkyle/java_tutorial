/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet_TreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Vu Duong
 */
public class HashSetDemo {   
     public static void main(String[] args) {  
        HashSet<Student> dsSV = new HashSet();
        dsSV.add(new Student("A05726", 8.5));
        dsSV.add(new Student("A06338", 7.0));
        dsSV.add(new Student("A05726", 9.5));
        dsSV.add(new Student("A04178", 9.5));
       /**mặc định cây đã đc sắp theo code do trogn lớp student đã
        * ghi đè hàm compare. Bây h muốn sắp theo 1 loại khác thì ta sẽ 
        * định nghĩa 1 biến so sánh comparator
        * 
        */
        System.out.println("sap danh sach tang dan theo ten:");
        Iterator<Student> it= dsSV.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                return Double.compare(t.getScore(), t1.getScore());
            }
        };  
        /**
         * hashSet không đảm bảo thứ tự sắp xếp. muốn sắp thì đổ sang
         * arraylist và sắp hoặc đổi sang treeSet
         * nếu đổi sang List thì vẫn có thể dùng theo biến comparator
         * nếu đổi sang TreeSet thì nó đổi theo tham số trong hàm conpare của 
         * lớp cơ sở
         */
        System.out.println("in va sắp bằng đổ sang list");
        ArrayList<Student> dsSV1=new ArrayList<Student>(dsSV);
        Collections.sort(dsSV1, c);
        System.out.println("sap danh sach tang dan theo điểm:");
        Iterator<Student> it1= dsSV1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }    
         System.out.println("in theo treeset tiêu chi trong hafmn compare-mã");
        //cách 2 đổ sang treeSet
        TreeSet<Student> dsSV2=new  TreeSet<>(dsSV);
        Iterator<Student> it3= dsSV2.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

     }
          
}
