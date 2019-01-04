package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

@Data
@Entity
public class StudentTracking {

   private @Id @GeneratedValue Long code;
   private Date departure;
   private Date arrival;

  @OneToMany(mappedBy = "studentTracking")
   private Set<Difficulty> difficulty;

  @OneToMany(mappedBy = "studentTracking")
   private Set<ReportCard> reportCards;

   public Long getCode(){return this.code; }

   public void setDeparture(Date value) {
      this.departure = value;
   }
   public Date getDeparture() {
      return this.departure;
   }

   public void setArrival(Date value) {
      this.arrival = value;
   }
   public Date getArrival() {
      return this.arrival;
   }

   public Set<Difficulty> getDifficulty() {
      if (this.difficulty == null) {
         this.difficulty = new HashSet<Difficulty>();
      }
      return this.difficulty;
   }
/*
   @ManyToMany
   private Set<Partners> updatedBy;

   public Set<Partners> getUpdatedBy() {
      if (this.updatedBy == null) {
         this.updatedBy = new HashSet<Partners>();
      }
      return this.updatedBy;
   }

   public void addPartner(Partners partner){
      this.updatedBy.add(partner);
   }
*/
   
   public Set<ReportCard> getReportCard() {
      if (this.reportCards == null) {
         this.reportCards = new HashSet<ReportCard>();
      }
      return this.reportCards;
   }

   public void addReportCard(ReportCard reportCard){
       if (this.reportCards == null) {
           this.reportCards = new HashSet<ReportCard>();
       }
       this.reportCards.add(reportCard);
   }
}
