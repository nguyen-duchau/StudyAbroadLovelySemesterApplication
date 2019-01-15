package fr.insa.soa.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.Year;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class SimpleEnrolment extends Enrolment {

    public SimpleEnrolment(){
        super();
    }

    public SimpleEnrolment(YearEnrolment yearEnrolment, Partners partner){
        super(yearEnrolment, partner);
    }
}
