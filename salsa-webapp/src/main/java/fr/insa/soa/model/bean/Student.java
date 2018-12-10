package fr.insa.soa.model.bean;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class Student extends Account {
/**
    * <pre>
    *           1..1     1..1
    * Student ------------------------- ReportCard
    *           student        &lt;       reportCard
    * </pre>
    */
   private ReportCard reportCard;
   
   public void setReportCard(ReportCard value) {
      this.reportCard = value;
   }
   
   public ReportCard getReportCard() {
      return this.reportCard;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Student ------------------------- Speciality
    *           student        &gt;       speciality
    * </pre>
    */
   private Speciality speciality;
   
   public void setSpeciality(Speciality value) {
      this.speciality = value;
   }
   
   public Speciality getSpeciality() {
      return this.speciality;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Student ------------------------- Country
    *           student        &lt;       nationality
    * </pre>
    */
   private Country nationality;
   
   public void setNationality(Country value) {
      this.nationality = value;
   }
   
   public Country getNationality() {
      return this.nationality;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * Student ------------------------- YearEnrolment
    *           student        &gt;       yearEnrolment
    * </pre>
    */
   private Set<YearEnrolment> yearEnrolment;
   
   public Set<YearEnrolment> getYearEnrolment() {
      if (this.yearEnrolment == null) {
         this.yearEnrolment = new HashSet<YearEnrolment>();
      }
      return this.yearEnrolment;
   }
   
   private String name;
   private Date birthday;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   }
