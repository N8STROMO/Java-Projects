/*
Displays numbers in a pyramid pattern
*/
import java.util.*;
public class Pyramid {
  public static void main(String args[]) {
    int startSpace = 0;
    int pyramidWidth;


    Scanner input = new Scanner(System.in);
    System.out.println("Enter a width for the pyramid: ");
    pyramidWidth = input.nextInt();
    pyramidWidth = pyramidWidth;

    // TODO How is pyramidWidth being used?

    for (int row = startSpace; row < pyramidWidth; row++)
    {
      // Controls white space
      for (int j = 0; j < pyramidWidth - row; j++)
      {
        System.out.print("  ");
      }

      // Displays ascending numners
      for (int k = 0; k <= row; k++) {
        System.out.print("1 ");
      }

      // TODO Display descending numbers

      System.out.println();
    }
  }
}

