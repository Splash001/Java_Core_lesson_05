package ua.lviv.lgs.waterworld;

public class Amphibia {
	
	String name;
	String food;
	String place;
	
	void eat(){
		System.out.println(name + " eats " + food);
	}
	
	void sleep(){
		System.out.println(name + " went to bed");
	}
	
	void swim() {
		System.out.println( name + " swims away to " + place);
	}
	
	void chill(){
		System.out.println(name + "'s just chillin");
	}
	
	

}
