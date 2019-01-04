package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.HashSet;

//@Data
//@Entity
public class Partners extends University {

   //TODO classe fille
/*   @ManyToMany(mappedBy = "updatedBy")
   private Set<StudentTracking> studentTracking;
   
   public Set<StudentTracking> getStudentTracking() {
      if (this.studentTracking == null) {
         this.studentTracking = new HashSet<StudentTracking>();
      }
      return this.studentTracking;
   }

   public void addStudentTracking (StudentTracking studentTracking){
      this.studentTracking.add(studentTracking);
   }
*/
}
