package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
public class StudentTracking {

    private @Id @GeneratedValue Long code;
    private Date departure;
    private Date arrival;

    @OneToMany(mappedBy = "studentTracking")
    private List<Difficulty> difficulty;

    @ManyToMany
    private List<Partners> updatedBy;

    @OneToMany(mappedBy = "studentTracking")
    private List<ReportCard> reportCards;

    public StudentTracking(){}

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

    public List<Difficulty> getDifficulty() {
      if (this.difficulty == null) {
         this.difficulty = new ArrayList<>();
      }
      return this.difficulty;
    }

    public void addDifficulty(Difficulty difficulty){
        if (this.difficulty == null) {
            this.difficulty = new ArrayList<>();
        }
        this.difficulty.add(difficulty);
    }

   public List<Partners> getUpdatedBy() {
      if (this.updatedBy == null) {
         this.updatedBy = new ArrayList<>();
      }
      return this.updatedBy;
   }

   public void addPartner(Partners partner){
       if (this.updatedBy == null) {
           this.updatedBy = new ArrayList<>();
       }
       this.updatedBy.add(partner);
   }
   
   public List<ReportCard> getReportCard() {
      if (this.reportCards == null) {
         this.reportCards = new ArrayList<>();
      }
      return this.reportCards;
   }

   public void addReportCard(ReportCard reportCard){
       if (this.reportCards == null) {
           this.reportCards = new ArrayList<>();
       }
       this.reportCards.add(reportCard);
   }
}
