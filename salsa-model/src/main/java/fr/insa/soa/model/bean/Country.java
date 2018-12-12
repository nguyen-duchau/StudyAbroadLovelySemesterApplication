package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class Country {
   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private char code;
   
   public void setCode(char value) {
      this.code = value;
   }
   
   public char getCode() {
      return this.code;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Country ------------------------- Student
    *           nationality        &gt;       student
    * </pre>
    */
   private Set<Student> student;
   
   public Set<Student> getStudent() {
      if (this.student == null) {
         this.student = new HashSet<Student>();
      }
      return this.student;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Country ------------------------- University
    *           country        &lt;       university
    * </pre>
    */
   private Set<University> university;
   
   public Set<University> getUniversity() {
      if (this.university == null) {
         this.university = new HashSet<University>();
      }
      return this.university;
   }
   
   }
