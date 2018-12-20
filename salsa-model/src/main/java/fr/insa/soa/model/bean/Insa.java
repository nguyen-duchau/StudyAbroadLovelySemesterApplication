package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class Insa extends University {
   /**
    * <pre>
    *           1..1     0..*
    * Insa ------------------------- Staff
    *           insa        &gt;       staff
    * </pre>
    */
   private Set<Staff> staff;
   
   public Set<Staff> getStaff() {
      if (this.staff == null) {
         this.staff = new HashSet<Staff>();
      }
      return this.staff;
   }
}
