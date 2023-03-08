package org.tnsif.tableperclass;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

//program to demonstrate on TablePerClass Inheritance
public class Employee implements Serializable{
	/*
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	//data member
	@Id
	private Integer id;
	private String name;
	private Float salary;
	
	//getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
		
	//toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
