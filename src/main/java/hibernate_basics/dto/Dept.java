package hibernate_basics.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {

	@Id
	int dept_no;
	
	
	int dept_name;
}
