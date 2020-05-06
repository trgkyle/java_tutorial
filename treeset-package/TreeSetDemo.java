/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Vu Duong
 */
public class TreeSetDemo {   
     public static void main(String[] args) {  
        SortedSet<Student> stuTree = new TreeSet();
        stuTree.add(new Student("A05726", 8.5));
        stuTree.add(new Student("A06338", 7.0));
        stuTree.add(new Student("A05379", 9.5));
        stuTree.add(new Student("A04178", 9.5));
       /**mặc định cây đã đc sắp theo code do trogn lớp student đã
        * ghi đè hàm compare. Bây h muốn sắp theo 1 loại khác thì ta sẽ 
        * định nghĩa 1 biến so sánh comparator
        * 
        */
        System.out.println("sap danh sach tang dan theo ten:");
        for(Student st:stuTree)
            System.out.println(st);
        
        Comparator<Student> c = new Comparator<Student>() {
              @Override
              public int compare(Student t, Student t1) {
                  return Double.compare(t.getScore(), t1.getScore());
              }
          };           
         TreeSet treeNew=new TreeSet(c);
         treeNew.addAll(stuTree);
         System.out.println("danh sau khi khi sap theo diem:");
         System.out.println(treeNew);
     }
          
}
