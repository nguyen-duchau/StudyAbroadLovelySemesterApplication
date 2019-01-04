package fr.insa.soa.model.bean;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Difficulty {

   private @Id @GeneratedValue Long id;
   private String description;
   private boolean treated;

   @ManyToOne
   private StudentTracking studentTracking;

   public Long getId() {
      return this.id;
   }
   
   public void setDescription(String value) {
      this.description = value;
   }
   public String getDescription() {
      return this.description;
   }

   public void setTreated(boolean value) {
      this.treated = value;
   }
   public boolean isTreated() {
      return this.treated;
   }

   public void setStudentTracking(StudentTracking value) {
      this.studentTracking = value;
   }
   public StudentTracking getStudentTracking() {
      return this.studentTracking;
   }

}
