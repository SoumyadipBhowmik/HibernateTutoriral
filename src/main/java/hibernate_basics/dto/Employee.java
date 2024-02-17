package hibernate_basics.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int e_id;
	
	@Column(nullable = false)
	private String e_name;
	
	private int e_sal;
	
	private int dept_no;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public int getE_sal() {
		return e_sal;
	}

	public void setE_sal(int e_sal) {
		this.e_sal = e_sal;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	
}
