package fr.insa.soa.model.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class LearningAgreement extends Enrolment {

   @OneToMany
   private List<Course> course;

   public LearningAgreement(){
       super();
   }
   
   public List<Course> getCourse() {
      if (this.course == null) {
         this.course = new ArrayList<>();
      }
      return this.course;
   }

   public void addCourse(Course course){
       if (this.course == null) {
           this.course = new ArrayList<>();
       }
       this.course.add(course);
   }

}
