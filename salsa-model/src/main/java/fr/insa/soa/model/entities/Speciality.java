package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Data
@Entity
@IdClass(Speciality.class)
public class Speciality implements Serializable {

   @Id
   private int year;

   @Id
   private String department;

   public Speciality() {}

   public Speciality(int year, String department) {
      this.department = department;
      this.year = year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getYear() {
      return this.year;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public String getDepartment() {
      return this.department;
   }

   // TODO student year will be replaced for instance by an integer
//   /**
//    * <pre>
//    *           1..1     1..1
//    * Speciality ------------------------- StudentYear
//    *           speciality        &gt;       year
//    * </pre>
//    */
//   private StudentYear year;
//
//   public void setYear(StudentYear value) {
//      this.year = value;
//   }
//
//   public StudentYear getYear() {
//      return this.year;
//   }

}

