package ua.lviv.lgs.waterworld;

public class Frog extends Amphibia {
	
	String name;
	String food;
	String place;
	
	public Frog(String name, String food, String place) {
		super();
		this.name = name;
		this.food = food;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public String getFood() {
		return food;
	}

	public String getPlace() {
		return place;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Frog [name=" + name + ", food=" + food + ", place=" + place + ", getName()=" + getName()
				+ ", getFood()=" + getFood() + ", getPlace()=" + getPlace() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	void eat() {
		System.out.println(name + " eats " + food);
	}
	
	@Override
	void sleep() {
		System.out.println(name + " went to bed");
	}	

	@Override
	void swim() {
		System.out.println(name + " swims away to " + place);
	}	

	@Override
	void chill() {
		System.out.println(name + "'s just chillin");
	}	



}
