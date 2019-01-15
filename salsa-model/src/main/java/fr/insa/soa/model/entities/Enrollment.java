package fr.insa.soa.model.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Enrollment implements Serializable {

   private @Id @GeneratedValue Long id;
   private String status;

   @ManyToOne
   @JsonIgnore
   private YearEnrollment yearEnrollment;

   @ManyToOne
   private Partners partner;

   Enrollment(){}

   Enrollment(YearEnrollment yearEnrolment, Partners partner){
      this.yearEnrollment=yearEnrolment;
      this.partner=partner;
   }

   public Long getId() {
      return id;
   }

   public void setStatus(String value) {
      this.status = value;
   }
   public String getStatus() {
      return this.status;
   }
   
   public void setYearEnrollment(YearEnrollment value) {
      this.yearEnrollment = value;
   }
   public YearEnrollment getYearEnrollment() {
      return this.yearEnrollment;
   }

   public void setPartner(Partners partner){this.partner = partner; }
   public Partners getPartner(){return this.partner; }

}
