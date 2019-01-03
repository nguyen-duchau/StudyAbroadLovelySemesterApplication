package fr.insa.soa.model.entities;

import java.util.Set;
import java.util.HashSet;

public class YearEnrolment {
   private int year;
   
   public void setYear(int value) {
      this.year = value;
   }
   
   public int getYear() {
      return this.year;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * YearEnrolment ------------------------- Student
    *           yearEnrolment        &lt;       student
    * </pre>
    */
   private Student student;
   
   public void setStudent(Student value) {
      this.student = value;
   }
   
   public Student getStudent() {
      return this.student;
   }
   
   /**
    * <pre>
    *           1..1     0..3
    * YearEnrolment ------------------------- Enrolment
    *           yearEnrolment        &gt;       enrolment
    * </pre>
    */
   private Set<Enrolment> enrolment;
   
   public Set<Enrolment> getEnrolment() {
      if (this.enrolment == null) {
         this.enrolment = new HashSet<Enrolment>(3);
      }
      return this.enrolment;
   }
   
}
