package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		double d;
		double p = getPopulation();
		double g = getGrowthRate();
		d = p*g;
		d *= .5*g;
		return d;
	}

}
