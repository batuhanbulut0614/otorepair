package ibmtal.otorepair.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="serviceparts")
public class ServicePart {
	private int id;
	private servicecard;
	private otopartname;
	private quantity;
	private price;

}
