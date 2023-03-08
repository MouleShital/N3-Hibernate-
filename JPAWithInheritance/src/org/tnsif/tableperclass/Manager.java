package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Manager_store")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Manager extends Employee{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//data members
	private Integer Dept_id;
	private String Dept_Name;
	
	//getters and setters
	public Integer getDept_id() {
		return Dept_id;
	}
	public void setDept_id(Integer dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_Name() {
		return Dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	
	@Override
	public String toString() {
		return "Manager [Dept_id=" + Dept_id + ", Dept_Name=" + Dept_Name + "]";
	}
	
	
}
