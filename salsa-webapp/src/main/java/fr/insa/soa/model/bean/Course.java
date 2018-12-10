package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class Course {
   private String code;
   
   public void setCode(String value) {
      this.code = value;
   }
   
   public String getCode() {
      return this.code;
   }
   
   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Course ------------------------- Speciality
    *           class        &lt;       speciality
    * </pre>
    */
   private Set<Speciality> speciality;
   
   public Set<Speciality> getSpeciality() {
      if (this.speciality == null) {
         this.speciality = new HashSet<Speciality>();
      }
      return this.speciality;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Course ------------------------- Score
    *           class        &lt;       score
    * </pre>
    */
   private Set<Score> score;
   
   public Set<Score> getScore() {
      if (this.score == null) {
         this.score = new HashSet<Score>();
      }
      return this.score;
   }
   
   private int etcs;
   
   public void setEtcs(int value) {
      this.etcs = value;
   }
   
   public int getEtcs() {
      return this.etcs;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Course ------------------------- University
    *           course        &lt;       proposedBy
    * </pre>
    */
   private University proposedBy;
   
   public void setProposedBy(University value) {
      this.proposedBy = value;
   }
   
   public University getProposedBy() {
      return this.proposedBy;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Course ------------------------- LearningAgreement
    *           course        &lt;       learningAgreement
    * </pre>
    */
   private Set<LearningAgreement> learningAgreement;
   
   public Set<LearningAgreement> getLearningAgreement() {
      if (this.learningAgreement == null) {
         this.learningAgreement = new HashSet<LearningAgreement>();
      }
      return this.learningAgreement;
   }
   
   }
