package fr.insa.soa.model.bean;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Enrolment {

   private @Id @GeneratedValue Long id;
   private String status;

   @ManyToOne
   private YearEnrolment yearEnrolment;

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
