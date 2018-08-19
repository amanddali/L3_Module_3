package abstract_classes.farm;

public class Cow extends Animal {

	public Cow(String noise, String manure) {
		super(noise, manure);
	}

	public String makeNoise() {
		noise = "Moo";
		System.out.println(noise);
		return noise;
	}

	public String feed() {
		manure = "Fed grass and pooped";
		System.out.println(manure);
		return manure;
	}

}
