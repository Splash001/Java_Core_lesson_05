package ua.lviv.lgs.exponente;


public class Main {
	
	public static void main(String[] args) {
	
		float a = 1.048576E+06f;
		float b = 2.32145E+04f;
		double c = 1.380650424E+23;
		double d = 2.3444250424E+13;
		
		if (a>b) {
			System.out.println(a + " - max");
			System.out.println(b + " - min");
		} else {
			System.out.println(b + " - max");
			System.out.println(a + " - min");
		}
		
		System.out.println("---------------------------------------------------");
		
		if (c>d) {
			System.out.println(c + " - max");
			System.out.println(d + " - min");
		} else {
			System.out.println(c + " - max");
			System.out.println(d + " - min");
		}
		
	}

}
