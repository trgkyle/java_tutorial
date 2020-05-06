/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet_TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TreeSetDemo1 {
    public static void main(String[] args)
    {  
        SortedSet<Student> dsSV = new TreeSet();
        dsSV.add(new Student("A05379", 9.5));
        dsSV.add(new Student("A04572", 9.5));
        dsSV.add(new Student("A07338", 7.0));
        dsSV.add(new Student("A01037", 6.5));
        
        System.out.println("sap danh sach tang dan theo ten:");
        System.out.println("sap danh sach tang dan theo ten:");
        Iterator<Student> it= dsSV.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


     }
}
