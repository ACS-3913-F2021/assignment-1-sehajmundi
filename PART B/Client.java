/** 
 * ACS-3913 Assignment 1 Part B
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
