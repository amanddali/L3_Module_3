package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		double d;
		double p = getPopulation();
		double g = getGrowthRate();
		d = p*g;
		d += p*.5;
		return d;
	}

}
