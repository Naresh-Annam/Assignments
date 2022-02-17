package com.Vsoft_HierarchyNaresh;

public class Departments {
	public String name;
	public Managers[] manager;
	public Developers[] developer;

	public void setManager(Managers[] manager) {
		this.manager = manager;
	}

	public Departments(String name, Developers[] developer) {
		this.name = name;
		this.developer = developer;
	}

	public Managers[] getManager() {
		return manager;
	}

	public Developers[] getDeveloper() {
		return developer;
	}
}
