package fr.insa.soa.model.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Session {

   private @Id Long id;
   private Integer code;

   @OneToOne(mappedBy = "session")
   private Score score;

   public Session(){}

   public Long getId(){return this.id; }

   public Integer getCode(){return this.code; }
   public void setCode(Integer code){this.code = code; }

   public void setScore(Score value) {
      this.score = value;
   }
   
   public Score getScore() {
      return this.score;
   }

}
