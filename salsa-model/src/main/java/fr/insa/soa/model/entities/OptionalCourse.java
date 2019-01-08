package fr.insa.soa.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@PrimaryKeyJoinColumn(name = "code")
public class OptionalCourse extends Course {

    public OptionalCourse(){
        super();
    }
}
