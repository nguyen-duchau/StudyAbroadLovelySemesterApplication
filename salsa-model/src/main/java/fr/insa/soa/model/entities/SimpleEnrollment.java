package fr.insa.soa.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class SimpleEnrollment extends Enrollment {

    public SimpleEnrollment(){
        super();
    }

    public SimpleEnrollment(YearEnrollment yearEnrolment, Partner partner){
        super(yearEnrolment, partner);
    }
}
