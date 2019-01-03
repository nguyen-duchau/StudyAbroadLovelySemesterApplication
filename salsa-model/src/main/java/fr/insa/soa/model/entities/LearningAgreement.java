package fr.insa.soa.model.entities;


import java.util.ArrayList;
import java.util.List;

public class LearningAgreement extends Enrolment {
   /**
    * <pre>
    *           0..*     0..*
    * LearningAgreement ------------------------- Course
    *           learningAgreement        &gt;       course
    * </pre>
    */
   private List<Course> course;
   
   public List<Course> getCourse() {
      if (this.course == null) {
         this.course = new ArrayList<Course>();
      }
      return this.course;
   }
   
   }
