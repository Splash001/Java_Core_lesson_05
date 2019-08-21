package ua.lviv.lgs.abtracts;

public class Cow extends Pet{
	
	private String name;
	private String noise;
	
	public Cow(String name, String noise) {
		super(name, noise);
		this.name = name;
		this.noise = noise;

	}

	public String getName() {
		return name;
	}

	public String getNoise() {
		return noise;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	@Override
	public String toString() {
		return "ß " + name + "- " + noise;
	}	

}
