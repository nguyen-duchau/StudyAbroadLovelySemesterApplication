package fr.insa.soa.model.entities;

import java.util.Set;
import java.util.HashSet;

public class Score {
   /**
    * <pre>
    *           0..*     1..1
    * Score ------------------------- ReportCard
    *           score        &lt;       reportCard
    * </pre>
    */
   private ReportCard reportCard;
   
   public void setReportCard(ReportCard value) {
      this.reportCard = value;
   }
   
   public ReportCard getReportCard() {
      return this.reportCard;
   }
   
   private int score;
   
   public void setScore(int value) {
      this.score = value;
   }
   
   public int getScore() {
      return this.score;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Score ------------------------- Course
    *           score        &gt;       class
    * </pre>
    */
   private Course course;
   
   public void setClass_(Course value) {
      this.course = value;
   }
   
   public Course getClass_() {
      return this.course;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Score ------------------------- Session
    *           score        &gt;       session
    * </pre>
    */
   private Set<Session> session;
   
   public Set<Session> getSession() {
      if (this.session == null) {
         this.session = new HashSet<Session>();
      }
      return this.session;
   }
   
   }
