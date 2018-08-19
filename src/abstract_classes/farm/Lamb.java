package abstract_classes.farm;

public class Lamb extends Animal {

	public Lamb(String noise, String manure) {
		super(noise, manure);
	}

	public String makeNoise() {
		noise = "bahhh";
		System.out.println(noise);
		return noise;
	}

	public String feed() {
		manure = "Fed grass and pooped";
		System.out.println(manure);
		return manure;
	}
}
