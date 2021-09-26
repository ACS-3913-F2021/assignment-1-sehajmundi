/** 
 * ACS-3913 Assignment 1 Part B
 * @author Sehaj Mundi
 * 3117464
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class Client {

    public static void main(String args[]) {

        // Population
        String [] names = new String[] {"Mario", "Donkey Kong", "Kirby", "Pikachu", 
                "Yoshi", "Captain Falcon", "Captain Falcon", "Samus", "Fox"};
        // Instantiate an algorithm and use it to select a sample
        // from the population
        SamplingStrategy strategy = new RandomSampling();
        SamplingHelper helper = new SamplingHelper(names, strategy);
        String[] sample = helper.selectSubset(3);

        // Output the sample
        for (int i = 0; i < sample.length; i++)
            System.out.println(sample[i]);
        System.out.println();

        // Create another sample using a different algorithm
        strategy = new SystematicSampling();
        helper = new SamplingHelper(names, strategy);
        sample = helper.selectSubset(4);

        for (int i = 0; i < sample.length; i++)
            System.out.println(sample[i]);

        //Algorithm shuffle
        System.out.println();
        algorithmShuffle(names);

        //Algorithm Reservoir
        System.out.println();
        algorithmReservoir(names);
    }

    public static void algorithmShuffle(String[] names)
    {
        //converting array to arraylist
        ArrayList<String>namesList = new ArrayList<>(Arrays.asList(names));
        Collections.shuffle(namesList);//shuffling the arraylist
        namesList.toArray(names);//converting back into an array
        for(int i = 0; i<4; i++)
        {
            System.out.println(names[i]);//printing 4 random names
        }
    }

    public static void algorithmReservoir(String[] names)
    {
        String[] reservoir = new String[4];
        Random generator = new Random();
        
        for(int i = 0; i<reservoir.length; i++)
        {
            reservoir[i] = names[i];//filling reservoir array
        }

        for(int i = reservoir.length; i < names.length; i++)
        {
            int j = generator.nextInt(names.length);//generating random rumber less than the size of names array
            if(j <= reservoir.length-1)
            {
                reservoir[j] = names[i];//replacing name at j in reservoir with name at i in names
            }
        }

        for(int i = 0; i<reservoir.length; i++)
        {
            System.out.println(reservoir[i]);//printing reservoir
        }
    }
}

/* Output is random. Example output:
Samus
Ness
Captain Falcon

Fox
Mario
Pikachu
Yoshi  
 */
