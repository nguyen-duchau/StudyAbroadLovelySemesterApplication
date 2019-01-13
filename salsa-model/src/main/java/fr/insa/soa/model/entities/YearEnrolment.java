package fr.insa.soa.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class YearEnrolment {

   private @Id String id;
   private Integer year;

   @OneToMany(mappedBy = "yearEnrolment")
   private List<Enrolment> enrolment;

   @ManyToOne
   @JsonIgnore
   private Student students;

   public YearEnrolment(String username, Integer year){
      this.id=username+"-"+year;
      this.year=year;
   }

   public YearEnrolment(){//TODO faire un mieux
      this.id= String.valueOf(Math.random()*1000)+"-2018";
   }

   public void setYear(Integer value) {
      this.year = value;
   }
   public Integer getYear() {
      return this.year;
   }

   public List<Enrolment> getEnrolment() {
      if (this.enrolment == null) {
         this.enrolment = new ArrayList<>(3);
      }
      return this.enrolment;
   }

   public void addEnrolment(Enrolment enrolment) {
      if (this.enrolment == null) {
         this.enrolment = new ArrayList<>(3);
      }
      this.enrolment.add(enrolment);
   }

   public Student getStudents(){
      return this.students;
   }

   public void setStudent(Student value) {
      this.students =value ;
   }
   
}
