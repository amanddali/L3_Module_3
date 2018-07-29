package abstract_classes.cities;
public class SanDiego extends City{
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		double d;
		double p = getPopulation();
		double g = getGrowthRate();
		d = p*g;
		d += 1000000;
		return d;
	}
}
