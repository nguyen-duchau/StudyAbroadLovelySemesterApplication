package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class University {

   private @Id String name;
   private String address;
   //private Country country;
   // private List<Course> course;
   
   public void setName(String value) {
      this.name = value;
   }
   public String getName() {
      return this.name;
   }
   
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
   /*
   public void setCountry(Country value) {
      this.country = value;
   }
   public Country getCountry() {
      return this.country;
   }
   */
   /**
    * <pre>
    *           1..1     0..*
    * University ------------------------- Course
    *           proposedBy        &gt;       course
    * </pre>
    */
   /*
   public List<Course> getCourse() {
      if (this.course == null) {
         this.course = new ArrayList<Course>();
      }
      return this.course;
   }*/
}
