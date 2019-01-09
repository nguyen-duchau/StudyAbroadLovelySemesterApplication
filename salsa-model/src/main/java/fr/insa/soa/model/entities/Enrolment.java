package fr.insa.soa.model.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Enrolment implements Serializable {

   private @Id @GeneratedValue Long id;
   private String status;

   @ManyToOne
   private YearEnrolment yearEnrolment;

   Enrolment(){}

   public Long getId() {
      return id;
   }

   public void setStatus(String value) {
      this.status = value;
   }
   public String getStatus() {
      return this.status;
   }
   
   public void setYearEnrolment(YearEnrolment value) {
      this.yearEnrolment = value;
   }
   public YearEnrolment getYearEnrolment() {
      return this.yearEnrolment;
   }

}
