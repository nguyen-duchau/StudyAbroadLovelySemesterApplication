package fr.insa.soa.model.entities;

import java.util.Set;
import java.util.HashSet;

public class Partners extends University {
   /**
    * <pre>
    *           0..*     0..*
    * Partners ------------------------- StudentTracking
    *           updatedBy        &lt;       studentTracking
    * </pre>
    */
   private Set<StudentTracking> studentTracking;
   
   public Set<StudentTracking> getStudentTracking() {
      if (this.studentTracking == null) {
         this.studentTracking = new HashSet<StudentTracking>();
      }
      return this.studentTracking;
   }
   
   }
