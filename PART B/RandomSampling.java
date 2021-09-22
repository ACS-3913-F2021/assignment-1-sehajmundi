/**
 * ACS-3913 Assignment 1 Part B
 * 
 * Concrete Strategy
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// Simple random sampling. Each element has an
// equal probability of being selected.
class RandomSampling implements SamplingStrategy {
    public String[] sample(String[] population, int sampleSize) {
        String[] subset = new String[sampleSize];
        Random generator = new Random();

        // Using an ArrayList makes it easy to sample
        // without replacement
        ArrayList<String> tempArray = new ArrayList<String>();

        for (int i = 0; i < population.length; i++)
            tempArray.add(population[i]);

        for (int i = 0; i < sampleSize; i++)
            subset[i] = tempArray.remove(generator.nextInt(tempArray.size()));

        return subset;
    }
}
