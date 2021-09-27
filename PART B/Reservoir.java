
/**
 * Write a description of class Reservoir here.
 *
 * @author Sehaj Mundi
 * 311746
 */
import java.util.*;
public class Reservoir implements SamplingStrategy
{
    public String[] sample(String[] population, int sampleSize) {
        String[] reservoir = new String[sampleSize];
        Random generator = new Random();

        for(int i = 0; i<reservoir.length; i++)
        {
            reservoir[i] = population[i];//filling reservoir array
        }

        for(int i = reservoir.length; i < population.length; i++)
        {
            int j = generator.nextInt(population.length);//generating random rumber less than the size of names array
            if(j <= reservoir.length-1)
            {
                reservoir[j] = population[i];//replacing name at j in reservoir with name at i in names
            }
        }
        return reservoir;
    }
}
