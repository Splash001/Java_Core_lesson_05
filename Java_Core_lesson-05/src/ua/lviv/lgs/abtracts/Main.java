package ua.lviv.lgs.abtracts;

public class Main {
	
	public static void main(String[] args) {
		
		Cow c = new Cow("��������", "����-����");
		System.out.println(c);
		
		Cat cat = new Cat("�����", "�����-�����");
		System.out.println(cat);
		
		Dog d = new Dog("�����", "�����-�����");
		System.out.println(d);
		
		c.voice();
		cat.voice();
		d.voice();
		
	}

}
