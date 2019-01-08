package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class YearEnrolment {

   private @Id int year;

   @OneToMany(mappedBy = "yearEnrolment")
   private List<Enrolment> enrolment;

   @ManyToMany
   private List<Student> students;

   public YearEnrolment(){}

   public void setYear(int value) {
      this.year = value;
   }
   public int getYear() {
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

   public List<Student> getStudents(){
      if (this.students == null) {
         this.students = new ArrayList<>();
      }
      return this.students;
   }

   public void addStudent(Student value) {
      if (this.students == null) {
         this.students = new ArrayList<>();
      }
      this.students.add(value) ;
   }
   
}
