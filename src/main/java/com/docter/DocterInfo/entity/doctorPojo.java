package com.docter.DocterInfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class doctorPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String specialist;

	public doctorPojo() {
		
	}

	public doctorPojo(int id, String name, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
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

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	@Override
	public String toString() {
		return "doctorPojo [id=" + id + ", name=" + name + ", specialist=" + specialist + "]";
	}
	
	
	
	
}
