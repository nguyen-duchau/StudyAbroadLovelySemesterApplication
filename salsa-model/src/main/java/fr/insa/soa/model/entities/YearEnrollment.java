package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class YearEnrollment {

   private @Id int year;

   @OneToMany(mappedBy = "yearEnrollment")
   private List<Enrollment> enrollment;

   @ManyToMany
   private List<Student> students;

   public YearEnrollment(){}

   public void setYear(int value) {
      this.year = value;
   }
   public int getYear() {
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
