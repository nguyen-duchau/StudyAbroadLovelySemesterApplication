package fr.insa.soa.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "name")
public class Insa extends University {

   @OneToMany(mappedBy = "insa")
   private List<Staff> staff;

   public Insa(){
       super();
   }
   
   public List<Staff> getStaff() {
       if (this.staff == null) {
        this.staff = new ArrayList<>();
       }
       return this.staff;
   }

   public void addStaff(Staff staff){
       if (this.staff == null) {
           this.staff = new ArrayList<>();
       }
       this.staff.add(staff);
   }

}
