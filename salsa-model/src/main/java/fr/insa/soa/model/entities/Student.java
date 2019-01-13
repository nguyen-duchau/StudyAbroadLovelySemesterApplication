package fr.insa.soa.model.entities;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "username")
public class Student extends Account {

   private String name;
   private Date birthday;

   @ManyToOne
   private Country nationality;

   @OneToOne
   private ReportCard reportCard;

   @ManyToOne
   private Speciality speciality;

   @OneToMany(mappedBy = "students")
   private List<YearEnrolment> yearEnrolments;

    public Student(String username){
        super(username);
    }

    public Student(){
        super("username");
    }

    public Student(String username, String password, Date birthday){

       super(username, password);
       this.birthday=birthday;
    }

   public void setName(String value) {
      this.name = value;
   }
   public String getName() {
      return this.name;
   }

   public void setBirthday(Date birthday){ this.birthday = birthday; }
   public Date getBirthday(){return this.birthday; }

   public void setNationality(Country value) {
      this.nationality = value;
   }
   public Country getNationality() {
      return this.nationality;
   }

   public void setReportCard(ReportCard value) {
      this.reportCard = value;
   }
   public ReportCard getReportCard() {
      return this.reportCard;
   }
   
   public void setSpeciality(Speciality value) {
      this.speciality = value;
   }
   public Speciality getSpeciality() {
      return this.speciality;
   }

   public List<YearEnrolment> getYearEnrolments(){
      if (this.yearEnrolments == null) {
         this.yearEnrolments = new ArrayList<>();
      }
      return this.yearEnrolments;
   }

   public void addYearEnrolment(YearEnrolment yearEnrolment){
      if (this.yearEnrolments == null) {
         this.yearEnrolments = new ArrayList<>();
      }
      this.yearEnrolments.add(yearEnrolment);
   }

}
