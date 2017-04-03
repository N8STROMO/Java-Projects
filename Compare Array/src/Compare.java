import java.util.Arrays;

/**
 * Created by johnpaul on 2/18/17.
 */
public class Compare {
    public static void main(String args[]) {

        //Declare two arrays and give them values; you could ask the user to input these values
        String[] arrayA = {"Horse", "Horse", "Horse"};
        String[] arrayB = {"Dog", "Cat", "Horse"};

        if (arrayA.length != arrayB.length) {
            System.out.println("The arrays do not contain identical elements");
            return;
        }

        // O (n log n)
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        // O (n)
        //This loops checks each word in arrayA
        for (int i = 0; i < arrayA.length; i++) {
           if (!arrayA[i].equals(arrayB[i])) {
               System.out.println("The arrays do not contain identical elements");
               return;
           }
        }

        // Overall O (n log n) since O(n) << O(n log n)
        System.out.println("The arrays do contain identical elements");
    }
}
