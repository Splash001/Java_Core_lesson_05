package ua.lviv.lgs.coin;

public class Main {
	
	public static void main(String[] args) {		
		
		int a = (int) (Math.random() * 2);		
		System.out.println(a);
		
		if (a == 0) {
			System.out.println("Выпал Орел");
		} else {
			System.out.println("Выпала Решка");
		}

	}

}
