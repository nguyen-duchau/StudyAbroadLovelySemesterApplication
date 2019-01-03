package fr.insa.soa.model.entities;


public class Session {
   /**
    * <pre>
    *           0..*     1..1
    * Session ------------------------- Score
    *           session        &lt;       score
    * </pre>
    */
   private Score score;
   
   public void setScore(Score value) {
      this.score = value;
   }
   
   public Score getScore() {
      return this.score;
   }
   
   }
