/**
 * ACS-3913 Assignment 1 Part B
 * 
 * Context
 */
class SamplingHelper {
	private String[] population;
	private SamplingStrategy strategy;

	public SamplingHelper(String[] population, SamplingStrategy strategy) {
		this.population = population;
		this.strategy = strategy;
	}

	public String[] selectSubset(int sampleSize) {
		return strategy.sample(population, sampleSize);
	}
}
