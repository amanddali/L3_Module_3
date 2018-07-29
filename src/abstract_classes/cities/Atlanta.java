package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		double d;
		double p = getPopulation();
		double g = getGrowthRate();
		d = p*g;
		d *= 2*g;
		return d;
	}

}
