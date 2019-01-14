package fr.insa.soa.model.entities;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "username")
public class Staff extends Account {

    public Staff(){
        super();
    }

    public Staff(String username, String password){
        super(username,password);
    }

    private String name;
    private String function;
    private String email;

    @ManyToOne
    private Insa insa;

    public void setName(String value) {
      this.name = value;
    }
    public String getName() {
      return this.name;
    }

    public void setFunction(String value) {
      this.function = value;
    }
    public String getFunction() {
      return this.function;
    }

    public void setEmail(String value) {
      this.email = value;
    }
    public String getEmail() {
      return this.email;
    }

    public void setInsa(Insa value) {
      this.insa = value;
    }
    public Insa getInsa() {
      return this.insa;
    }

}
