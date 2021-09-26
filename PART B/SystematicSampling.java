/**
 * ACS-3913 Assignment 1 Part B
 * @author Sehaj Mundi
 * 3117464
 * Concrete Strategy
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// Systematic sampling algorithm.
// Sort elements and then select elements at regular intervals
class SystematicSampling implements SamplingStrategy {
    public String[] sample(String[] population, int sampleSize) {
        String[] subset = new String[sampleSize];
        Random generator = new Random();

        // Make a copy of the population array.
        // We don't want to cause function side effects.
        String[] sortedPopulation = new String[population.length];
        System.arraycopy(population, 0, sortedPopulation, 0, population.length);
        Arrays.sort(sortedPopulation);

        int step = sortedPopulation.length / sampleSize;
        int startingPoint = generator.nextInt(step + 1);

        // select elements at regular interval ‘step’
        for (int i = 0; i < sampleSize; i++)
            subset[i] = sortedPopulation[startingPoint + (i * step)];

        return subset;
    }
}
