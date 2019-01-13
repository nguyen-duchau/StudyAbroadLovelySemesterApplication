package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class University implements Serializable {

   private @Id String name;
   private String address;

   @ManyToOne
   private Country country;

   @ManyToMany
   private List<Course> courses;

   University(){}
   University(String name,String address){
      this.name=name;
      this.address=address;
   }
   
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
         this.courses = new ArrayList<>();
      }
      return this.courses;
   }

   public void addCourse(Course course){
      if (this.courses == null) {
         this.courses = new ArrayList<>();
      }
      this.courses.add(course);
   }
}
