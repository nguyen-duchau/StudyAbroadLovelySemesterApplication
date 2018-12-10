package fr.insa.soa.model.bean;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;

public class StudentTracking {
   private Date departure;
   
   public void setDeparture(Date value) {
      this.departure = value;
   }
   
   public Date getDeparture() {
      return this.departure;
   }
   
   private Date arrival;
   
   public void setArrival(Date value) {
      this.arrival = value;
   }
   
   public Date getArrival() {
      return this.arrival;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * StudentTracking ------------------------- ReportCard
    *           studentTracking        &gt;       reportCard
    * </pre>
    */
   private Set<ReportCard> reportCard;
   
   public Set<ReportCard> getReportCard() {
      if (this.reportCard == null) {
         this.reportCard = new HashSet<ReportCard>();
      }
      return this.reportCard;
   }
   
   /**
    * <pre>
    *           0..1     0..*
    * StudentTracking ------------------------- Difficulty
    *           studentTracking        &gt;       difficulty
    * </pre>
    */
   private Set<Difficulty> difficulty;
   
   public Set<Difficulty> getDifficulty() {
      if (this.difficulty == null) {
         this.difficulty = new HashSet<Difficulty>();
      }
      return this.difficulty;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * StudentTracking ------------------------- Partners
    *           studentTracking        &gt;       updatedBy
    * </pre>
    */
   private Set<Partners> updatedBy;
   
   public Set<Partners> getUpdatedBy() {
      if (this.updatedBy == null) {
         this.updatedBy = new HashSet<Partners>();
      }
      return this.updatedBy;
   }
   
   }
