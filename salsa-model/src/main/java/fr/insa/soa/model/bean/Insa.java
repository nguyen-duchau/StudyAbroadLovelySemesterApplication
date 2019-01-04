package fr.insa.soa.model.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.HashSet;

//@Data
//@Entity
public class Insa extends University {

   private @Id Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
/*
   @OneToMany(mappedBy = "insa")
   private Set<Staff> staff;
   
   public Set<Staff> getStaff() {
      if (this.staff == null) {
         this.staff = new HashSet<Staff>();
      }
      return this.staff;
   }

   public void addStaff(Staff staff){
      this.staff.add(staff);
   }
   */

}
