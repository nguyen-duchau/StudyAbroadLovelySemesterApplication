package fr.insa.soa.model.bean;


public class StudentYear {
   private int studentYear;
   
   public void setStudentYear(int value) {
      this.studentYear = value;
   }
   
   public int getStudentYear() {
      return this.studentYear;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * StudentYear ------------------------- Speciality
    *           year        &lt;       speciality
    * </pre>
    */
   private Speciality speciality;
   
   public void setSpeciality(Speciality value) {
      this.speciality = value;
   }
   
   public Speciality getSpeciality() {
      return this.speciality;
   }
   
   }
