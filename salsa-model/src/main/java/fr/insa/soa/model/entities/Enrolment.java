package fr.insa.soa.model.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
   @JsonIgnore
   private YearEnrolment yearEnrolment;

   @ManyToOne
   private Partners partner;

   Enrolment(){}
   Enrolment(YearEnrolment yearEnrolment, Partners partner){
      this.yearEnrolment=yearEnrolment;
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
   
   public void setYearEnrolment(YearEnrolment value) {
      this.yearEnrolment = value;
   }
   public YearEnrolment getYearEnrolment() {
      return this.yearEnrolment;
   }

   public void setPartner(Partners partner){this.partner = partner; }
   public Partners getPartner(){return this.partner; }

}
