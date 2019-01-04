package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.*;

//@Data
//@Entity
public class LearningAgreement extends Enrolment {

   //Todo classe fille

/*   @OneToMany
   private Set<Course> course;
   
   public Set<Course> getCourse() {
      if (this.course == null) {
         this.course = new HashSet<Course>();
      }
      return this.course;
   }

   public void addCourse(Course course){
      this.course.add(course);
   }
*/
}
