package com.entity;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private int age;
	private String content;
	private Date birthday;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", content=" + content + ", birthday="
				+ birthday + "]";
	}
	public Person(int id, String name, int age, String content, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.content = content;
		this.birthday = birthday;
	}
	public Person(String name, int age, String content, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
		this.birthday = birthday;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
