package abstract_classes.farm;

public class Chicken extends Animal {

	public Chicken(String noise, String manure) {
		super(noise, manure);
	}

	public String makeNoise() {
		noise = "bak bak";
		System.out.println(noise);
		return noise;
	}

	public String feed() {
		manure = "Fed seeds and pooped";
		System.out.println(manure);
		return manure;
	}

}
