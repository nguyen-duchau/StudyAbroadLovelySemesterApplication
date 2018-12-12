package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class ReportCard {
   /**
    * <pre>
    *           1..1     1..1
    * ReportCard ------------------------- Student
    *           reportCard        &gt;       student
    * </pre>
    */
   private Student student;
   
   public void setStudent(Student value) {
      this.student = value;
   }
   
   public Student getStudent() {
      return this.student;
   }
   
   private StudentYear year;
   
   public void setYear(StudentYear value) {
      this.year = value;
   }
   
   public StudentYear getYear() {
      return this.year;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * ReportCard ------------------------- Score
    *           reportCard        &gt;       score
    * </pre>
    */
   private Set<Score> score;
   
   public Set<Score> getScore() {
      if (this.score == null) {
         this.score = new HashSet<Score>();
      }
      return this.score;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * ReportCard ------------------------- StudentTracking
    *           reportCard        &lt;       studentTracking
    * </pre>
    */
   private StudentTracking studentTracking;
   
   public void setStudentTracking(StudentTracking value) {
      this.studentTracking = value;
   }
   
   public StudentTracking getStudentTracking() {
      return this.studentTracking;
   }
   
   }
