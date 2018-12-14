package fr.insa.soa.model.bean;


import java.util.ArrayList;
import java.util.List;

public class University {

   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private String address;
   
   public void setAddress(String value) {
      this.address = value;
   }
   
   public String getAddress() {
      return this.address;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * University ------------------------- Country
    *           university        &gt;       country
    * </pre>
    */
   private Country country;
   
   public void setCountry(Country value) {
      this.country = value;
   }
   
   public Country getCountry() {
      return this.country;
   }
   
   /**
    * <pre>
    *           1..1     0..*
    * University ------------------------- Course
    *           proposedBy        &gt;       course
    * </pre>
    */
   private List<Course> course;
   
   public List<Course> getCourse() {
      if (this.course == null) {
         this.course = new ArrayList<Course>();
      }
      return this.course;
   }
   
   }
