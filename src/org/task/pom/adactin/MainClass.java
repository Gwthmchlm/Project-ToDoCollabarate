package org.task.pom.adactin;

public class MainClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	luanchBrowser();
	url("https://www.adactin.com/HotelApp/");
	currentUrl();
	title();
	// POJO CLASS 1
	PojoClass1 p1 = new PojoClass1();
	fill(p1.getUser(), "GOWTHAMK");
	fill(p1.getPass(), "S1BO4I");
	clk(p1.getLogin());

// pojo class 2
	PojoClass2 p2 = new PojoClass2();
	dropDown(p2.getLocation(), "London");
	dropDown(p2.getHotels(), "Hotel Hervey");
	dropDown(p2.getRoom_type(), "Super Deluxe");
	dropDown(p2.getRoom_nos(), "2 - Two");
	dropDown(p2.getAdult(), "2 - Two");
	dropDown(p2.getChild_room(), "1 - One");
	clk(p2.getSubmit());
	
	// pojo class 3
	PojoClass3 p3 = new PojoClass3();
	clk(p3.getRadiobutton());
	clk(p3.getContinuee());
	
	// pojo class 4
	PojoClass4 p4 = new PojoClass4();
	fill(p4.getName(), "Gowtham");
	fill(p4.getLast(), "sundaram");
	fill(p4.getAddress(), " 230 B1 SUNRISE HOME PERTANTHAR KADU KOMARAPALAYAM PIN CODE - 638183");
	fill(p4.getCc(), "1234567812345678");
	dropDown(p4.getCctype(), "VISA");
	dropDown(p4.getMonth(), "February");
	dropDown(p4.getYear(), "2022");
	fill(p4.getCvv(), "012");
	clk(p4.getBook());
	
// pojo class 5
	PojoClass5 p5 = new PojoClass5();
	Thread.sleep(5000);
	value(p5.getId());
	clk(p5.getSearch());

}
}
