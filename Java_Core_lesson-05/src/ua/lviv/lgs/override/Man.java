package ua.lviv.lgs.override;

public class Man {
	
	int age;
	String name;
	double height;
	int weight;
	
	public Man(int age, String name, double height, int weight){
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	
	public void data() {
		System.out.println(age + "х річний атлет " + name + ". Зріст - " + height + "; Вага - " + weight);
	}

}
