
/**
 * Write a description of class Shuffle here.
 *
 * @author Sehaj Mundi
 * 3117464
 */
import java.util.*;
public class Shuffle implements SamplingStrategy
{
    public String[] sample(String[] population, int sampleSize) {
        ArrayList<String>namesList = new ArrayList<>(Arrays.asList(population));
        Collections.shuffle(namesList);//shuffling the arraylist
        namesList.toArray(population);//converting back into an array
        String [] result = new String[sampleSize];
        for(int i = 0; i<sampleSize; i++)
        {
            result[i] = population[i];//populating new array with shuffled values
        }
        return result;
    }
}
