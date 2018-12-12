package fr.insa.soa.model.bean;

import fr.insa.soa.model.reject.Course;

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
   private Set<fr.insa.soa.model.reject.Course> course;
   
   public Set<fr.insa.soa.model.reject.Course> getCourse() {
      if (this.course == null) {
         this.course = new HashSet<Course>();
      }
      return this.course;
   }
   
   }
