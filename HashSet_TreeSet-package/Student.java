/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet_TreeSet;

import java.util.Objects;

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
     public String getcode()
     {  
          return code;
     }
     
     public String toString()
     {  
          return "(" + code + "," + score + ")";
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
          Student sv=(Student) t;
          return code.compareToIgnoreCase(sv.getcode());
            
    }
    
        
}

