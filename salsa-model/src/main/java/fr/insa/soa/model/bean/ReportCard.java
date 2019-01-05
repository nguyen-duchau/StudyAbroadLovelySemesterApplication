package fr.insa.soa.model.bean;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ReportCard {

   private @Id @GeneratedValue Long id;
   private Integer year;

   @OneToOne(mappedBy = "reportCard")
   private Student student;

   @OneToMany(mappedBy = "reportCard" )
   private List<Score> scores;

   @ManyToOne
   private StudentTracking studentTracking;

   public ReportCard(){}

   public Long getId() {
      return id;
   }

   public Integer getYear() {
      return this.year;
   }
   public void setYear(Integer year){ this.year = year; }

   public void setStudent(Student value) {
      this.student = value;
   }
   public Student getStudent() {
      return this.student;
   }

   public List<Score> getScores() {
      if (this.scores == null) {
         this.scores = new ArrayList<>();
      }
      return this.scores;
   }

   public void addScore(Score score){
      if (this.scores == null) {
         this.scores = new ArrayList<>();
      }
      this.scores.add(score);
   }

   public void setStudentTracking(StudentTracking value) {
      this.studentTracking = value;
   }
   public StudentTracking getStudentTracking() {
      return this.studentTracking;
   }

}
