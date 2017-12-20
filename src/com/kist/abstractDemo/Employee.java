package com.kist.abstractDemo;

public abstract class Employee {
	private int id;
	private String name;
	private String level;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public abstract void salary();
	public abstract void department();
	public abstract void tax();
	@Override
	public String toString() {
		return "AbstractDemo [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
	
	
	

}
