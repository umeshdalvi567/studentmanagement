package com.example.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Student {
public Student(int id, String name, String college, String type) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.type = type;
	}
public Student() {
	// TODO Auto-generated constructor stub
}
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", type=" + type + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getCollege()=" + getCollege() + ", getType()=" + getType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
@Id
@GeneratedValue (strategy=GenerationType.AUTO)
//@GenericGenerator( name = "increment", strategy = "increment" )
	private int id;
	private String name;
	private String college;
	private String type;
}
