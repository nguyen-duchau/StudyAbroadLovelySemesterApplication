package fr.insa.soa.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class YearEnrollment {

   private @Id String id;
   private Integer year;

   @OneToMany(mappedBy = "yearEnrollment")
   private List<Enrollment> enrollment;

   @ManyToOne
   @JsonIgnore
   private Student students;

   public YearEnrollment(String username, Integer year){
      this.id=username+"-"+year;
      this.year=year;
   }

   public YearEnrollment(){//TODO faire un mieux
      this.id= String.valueOf(Math.random()*1000)+"-2018";
   }

   public void setYear(Integer value) {
      this.year = value;
   }
   public Integer getYear() {
      return this.year;
   }

   public List<Enrollment> getEnrollment() {
      if (this.enrollment == null) {
         this.enrollment = new ArrayList<>(3);
      }
      return this.enrollment;
   }

   public void addEnrollment(Enrollment enrollment) {
      if (this.enrollment == null) {
         this.enrollment = new ArrayList<>(3);
      }
      this.enrollment.add(enrollment);
   }

   public Student getStudents(){
      return this.students;
   }

   public void setStudent(Student value) {
      this.students =value ;
   }
   
}
