package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class LearningAgreement extends Enrolment {
   /**
    * <pre>
    *           0..*     0..*
    * LearningAgreement ------------------------- Course
    *           learningAgreement        &gt;       course
    * </pre>
    */
   private Set<Course> course;
   
   public Set<Course> getCourse() {
      if (this.course == null) {
         this.course = new HashSet<Course>();
      }
      return this.course;
   }
   
   }
