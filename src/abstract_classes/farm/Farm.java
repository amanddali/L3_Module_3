package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Animal cow = new Cow("Moo", "Fed grass and pooped");
		Animal pig = new Pig("oink", "Fed fruits and pooped");
		Animal chicken = new Chicken("bak bak", "Fed seeds and pooped");
		Animal lamb = new Lamb("bahhh", "Fed grass and pooped");

		animals.add(cow);
		animals.add(pig);
		animals.add(chicken);
		animals.add(lamb);

		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
			animals.get(i).feed();
		}
	}
}
