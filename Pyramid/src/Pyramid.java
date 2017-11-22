import java.util.*;
public class Pyramid
{
  public static void main(String args[])
  {
    int pyramidWidth;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a width for the pyramid: ");
    pyramidWidth = input.nextInt();

    for (int row = 1; row <= pyramidWidth; row++)
    {
      int endspace = pyramidWidth;
      // Controls white space
      for (int startSpace = 0; startSpace < endspace; startSpace++)
      {
        System.out.print(" ");
      }

      // Displays ascending numbers
      for (int leftSide = 0; leftSide < row; leftSide++)
      {
        System.out.print("0");
      }

      // Display descending numbers
      for (int rightSide = 0; rightSide < row - 1; rightSide++)
      {
        System.out.print("0");
      }

      System.out.println();
      pyramidWidth--;
    }
  }
}

