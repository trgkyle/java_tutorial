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
 * @author Vu Duong
 */
class Student implements Comparable
{ 
     private String code;
     private double score;
     public Student(String code, double score)
     {    this.code = code;
          this.score = score;
     }
     public double getScore()
     {  
          return score;
     }
     public String toString()
     {  
          return "(" + code + "," + score + ")";
     }
    public boolean equals(Object other)
    {     Student otherStu = (Student) other;
          return code.equals(otherStu.code);
    }
    public int compareTo(Object other)
    {  
          Student otherStu = (Student) other;          
          return code.compareTo(otherStu.code);
    }
        
}

