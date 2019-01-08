package fr.insa.soa.model.bean;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Speciality {

   private @Id String code;
   private String department;

   @OneToMany(mappedBy = "speciality")
   private List<Student> students;

   @ManyToMany
   private List<Course> courses;

   public Speciality(){}

   public void setCode(String code){
      this.code = code;
   }
   public String getCode(){return this.code; }

   public void setDepartment(String value) {
      this.department = value;
   }
   public String getDepartment() {
      return this.department;
   }

   public List<Student> getStudents() {
      if (this.students == null) {
         this.students = new ArrayList<>();
      }
      return this.students;
   }

   public void addStudent(Student student){
      if (this.students == null) {
         this.students = new ArrayList<>();
      }
      this.students.add(student);
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
