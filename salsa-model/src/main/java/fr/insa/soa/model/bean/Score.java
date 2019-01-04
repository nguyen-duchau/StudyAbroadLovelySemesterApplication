package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Data
@Entity
public class Score {

   private @Id @GeneratedValue Long id;
   private int score;

   @ManyToOne
   private ReportCard reportCard;

   @OneToOne
   private Course course;

   @OneToOne
   private Session session;

   public Long getId(){return this.id; }

   public void setScore(int value) {
      this.score = value;
   }
   public int getScore() {
      return this.score;
   }

   public void setReportCard(ReportCard value) {
      this.reportCard = value;
   }
   public ReportCard getReportCard() {
      return this.reportCard;
   }
   
   public void setCourse(Course value) {
      this.course = value;
   }
   public Course getCourse() {
      return this.course;
   }
   
   public Session getSession() {
      return this.session;
   }
   public void setSession(Session session){
      this.session= session;
   }

}
