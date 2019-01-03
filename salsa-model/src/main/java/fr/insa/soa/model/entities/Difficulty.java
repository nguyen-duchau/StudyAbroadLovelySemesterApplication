package fr.insa.soa.model.entities;


public class Difficulty {
   private String id;
   
   public void setId(String value) {
      this.id = value;
   }
   
   public String getId() {
      return this.id;
   }
   
   private String description;
   
   public void setDescription(String value) {
      this.description = value;
   }
   
   public String getDescription() {
      return this.description;
   }
   
   private boolean treated;
   
   public void setTreated(boolean value) {
      this.treated = value;
   }
   
   public boolean isTreated() {
      return this.treated;
   }
   
   /**
    * <pre>
    *           0..*     0..1
    * Difficulty ------------------------- StudentTracking
    *           difficulty        &lt;       studentTracking
    * </pre>
    */
   private StudentTracking studentTracking;
   
   public void setStudentTracking(StudentTracking value) {
      this.studentTracking = value;
   }
   
   public StudentTracking getStudentTracking() {
      return this.studentTracking;
   }
   
   }
