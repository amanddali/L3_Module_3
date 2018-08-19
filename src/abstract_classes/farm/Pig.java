package abstract_classes.farm;

public class Pig extends Animal {

	public Pig(String noise, String manure) {
		super(noise, manure);
	}

	public String makeNoise() {
		noise = "oink";
		System.out.println(noise);
		return noise;
	}

	public String feed() {
		manure = "Fed fruits and pooped";
		System.out.println(manure);
		return manure;
	}

}
