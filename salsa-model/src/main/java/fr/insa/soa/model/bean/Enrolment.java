package fr.insa.soa.model.bean;


public class Enrolment {
   private String status;
   
   public void setStatus(String value) {
      this.status = value;
   }
   
   public String getStatus() {
      return this.status;
   }
   
   private YearEnrolment yearEnrolment;
   
   public void setYearEnrolment(YearEnrolment value) {
      this.yearEnrolment = value;
   }
   
   public YearEnrolment getYearEnrolment() {
      return this.yearEnrolment;
   }
   
   }
