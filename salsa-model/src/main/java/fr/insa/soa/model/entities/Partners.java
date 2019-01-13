package fr.insa.soa.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "name")
public class Partners extends University {

   @ManyToMany(mappedBy = "updatedBy")
   private List<StudentTracking> studentTracking;

   public Partners(){
       super();
   }

   public Partners (String name, String address){
       super(name,address);
   }
   
   public List<StudentTracking> getStudentTracking() {
      if (this.studentTracking == null) {
         this.studentTracking = new ArrayList<>();
      }
      return this.studentTracking;
   }

   public void addStudentTracking (StudentTracking studentTracking){
       if (this.studentTracking == null) {
           this.studentTracking = new ArrayList<>();
       }
      this.studentTracking.add(studentTracking);
   }

}
