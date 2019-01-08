package fr.insa.soa.model.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "code")
public class MandatoryCourse extends Course {

    public MandatoryCourse(){
        super();
    }
}
