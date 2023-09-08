	package com.me.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Document
@Builder
@Data
@AllArgsConstructor

public class Cook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Field
	@Column(name="nameEmp")
	private String name;
	
	@NotBlank
	@Field
	private String email;
	
    @Field
	private int age;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}

	public Cook() {
		super();
	}

	public Cook(String name, String email, int age) {
		super();
		this.name = name;
		this.name = name;
		this.age = age;
	}

	
	
	
	
}