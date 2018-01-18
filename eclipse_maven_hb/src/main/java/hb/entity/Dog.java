package hb.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dog")
@DiscriminatorValue(value="doggg")
public class Dog extends Animal
{

}
