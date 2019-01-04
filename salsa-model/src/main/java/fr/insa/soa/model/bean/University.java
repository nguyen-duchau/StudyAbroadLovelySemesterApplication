package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class University {

   private @Id String name;
   private String address;

   @ManyToOne
   private Country country;

   @ManyToMany
   private List<Course> courses;
   
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

   public void setCountry(Country value) {
      this.country = value;
   }
   public Country getCountry() {
      return this.country;
   }

   public List<Course> getCourses() {
      if (this.courses == null) {
         this.courses = new ArrayList<Course>();
      }
      return this.courses;
   }

   public void addCourse(Course course){
      if (this.courses == null) {
         this.courses = new ArrayList<Course>();
      }
      this.courses.add(course);
   }
}
