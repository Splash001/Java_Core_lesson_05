package ua.lviv.lgs.abtracts;

public class Main {
	
	public static void main(String[] args) {
		
		Cow c = new Cow("Ασπόξνκΰ", "Μσσσ-Μσσσ");
		System.out.println(c);
		
		Cat cat = new Cat("Πθζθκ", "Μÿσσσ-Μÿσσσ");
		System.out.println(cat);
		
		Dog d = new Dog("Αΰπρ³κ", "Γΰσσσ-Γΰσσσ");
		System.out.println(d);
		
		c.voice();
		cat.voice();
		d.voice();
		
	}

}
