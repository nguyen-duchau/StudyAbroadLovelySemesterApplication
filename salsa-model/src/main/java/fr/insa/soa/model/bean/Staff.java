package fr.insa.soa.model.bean;


public class Staff extends Account {

   private String name;
   
   public void setName(String value) {
      this.name = value;
   }
   
   public String getName() {
      return this.name;
   }
   
   private String function;
   
   public void setFunction(String value) {
      this.function = value;
   }
   
   public String getFunction() {
      return this.function;
   }
   
   private String email;
   
   public void setEmail(String value) {
      this.email = value;
   }
   
   public String getEmail() {
      return this.email;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * Staff ------------------------- Insa
    *           staff        &lt;       insa
    * </pre>
    */
   private Insa insa;
   
   public void setInsa(Insa value) {
      this.insa = value;
   }
   
   public Insa getInsa() {
      return this.insa;
   }
   
   }
