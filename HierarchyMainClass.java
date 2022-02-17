package com.Vsoft_HierarchyNaresh;

public class HierarchyMainClass {

	public static void main(String[] args) {
		Developers dev1 = new Developers("Naresh", "Java");
		Developers dev2 = new Developers("Praveen", "Java");
		Developers dev3 = new Developers("preetham", "Java");
		Developers dev4 = new Developers("Hemanth", "Mulesoft");
		Developers dev5 = new Developers("Shivani", "Mulesoft");
		Developers dev6 = new Developers("Hemalatha", "Mulesoft");
		Developers dev7 = new Developers("poornima", "AWS");
		Developers dev8 = new Developers("Vamsi", "AWS");
		Developers dev9 = new Developers("Eshwar", "AWS");
		Developers dev10 = new Developers("Mukheed", "Azure");
		Developers dev11 = new Developers("Akhila", "Azure");
		Developers dev12 = new Developers("sravani", "Azure");
		Developers dev13 = new Developers("Lalitha", "Servive_now");
		Developers dev14 = new Developers("Shyam", "Servive_now");
		Developers dev15 = new Developers("Radhika", "Servive_now");
		Developers[] javaDevelopers = { dev1, dev2, dev3 };
		Developers[] mulesoftDevelopers = { dev4, dev5, dev6 };
		Developers[] AWSDevelopers = { dev7, dev8, dev9 };
		Developers[] AzureDevelopers = { dev10, dev11, dev12 };
		Developers[] servicenowDevelopers = { dev13, dev14, dev15 };
		Departments java = new Departments("Java", javaDevelopers);
		Departments mulesoft = new Departments("Mulesoft", mulesoftDevelopers);
		Departments aws = new Departments("AWS", AWSDevelopers);
		Departments azure = new Departments("Azure", AWSDevelopers);
		Departments servicenow = new Departments("Service_Now", servicenowDevelopers);
	//	President president = new President("Manoj",);

	}

}
