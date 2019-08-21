package ua.lviv.lgs.abtracts;

public abstract class Pet {
	
	private String name;
	private String noise;
	
	public Pet(String name, String noise) {
		super();
		this.name = name;
		this.noise = noise;
	}
	
	void voice() {
		System.out.println("ß " + name + "- " + noise);
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
		return "Pet [name=" + name + ", noise=" + noise + "]";
	}	

}
