package abstract_classes.farm;

public abstract class Animal {
	protected String noise;
	protected String manure;

	public Animal(String noise, String manure) {
		this.noise = noise;
		this.manure = manure;
	}

	public String makeNoise() {
		return noise;
	}

	public String feed() {
		return manure;
	}
}
