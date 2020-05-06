/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TreeSetDemo1 {
    public static void main(String[] args)
    {  
        SortedSet stuTree = new TreeSet();
        stuTree.add(new Student("A045726", 9.5));
        stuTree.add(new Student("A06338", 7.0));
        stuTree.add(new Student("A05379", 9.5));
        stuTree.add(new Student("A05379", 6.5));
        
        System.out.println("sap danh sach tang dan theo ten:");
        System.out.println(stuTree);
        SortedSet sortByScore = new TreeSet(new Comparator()
            {   public int compare(Object a, Object b)
                    {  
                        Student itemA = (Student) a;
                        Student itemB = (Student) b;
                        double scoreA = itemA.getScore();
                        double scoreB = itemB.getScore();               
	              if ( scoreA < scoreB )
		        return -1;
		   else 
		        return 1;
                    }
                }); // end of inner class

         sortByScore.addAll(stuTree);
         System.out.println("danh sau khi khi sap theo diem:");
         System.out.println(sortByScore);
     }
}
