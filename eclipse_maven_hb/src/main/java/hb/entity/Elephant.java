package hb.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="elephant")
@DiscriminatorValue(value="elephant")
public class Elephant extends Animal
{
	
}
