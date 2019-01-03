package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Country {
   private @Id String name;
   /*
   private Set<Student> student;
   private Set<University> university;
   */

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
   /*
   public Set<Student> getStudent() {
      if (this.student == null) {
         this.student = new HashSet<Student>();
      }
      return this.student;
   }
   */
   /**
    * <pre>
    *           1..1     0..*
    * Country ------------------------- University
    *           country        &lt;       university
    * </pre>
    */
   /*
   public Set<University> getUniversity() {
      if (this.university == null) {
         this.university = new HashSet<University>();
      }
      return this.university;
   }
   */
   
}
