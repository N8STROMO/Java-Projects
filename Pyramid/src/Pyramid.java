import java.util.*;
public class Pyramid
{
  public static void main(String args[])
  {
    int startRight = 0;
    int pyramidWidth;


    Scanner input = new Scanner(System.in);
    System.out.println("Enter a width for the pyramid: ");
    pyramidWidth = input.nextInt();

    // TODO Better way to implement considering pyramid width

    for (int row = 1; row < pyramidWidth; row += row)
    {
      // Controls white space
      for (int startSpace = 0; startSpace < pyramidWidth; startSpace++)
      {
        System.out.print(" ");
      }

      // Displays ascending numbers
      for (int leftSide = 1; leftSide <= row; leftSide += leftSide)
      {
        System.out.print("0");
      }

      // Display descending numbers
      for (int rightSide = startRight; rightSide > 0; rightSide /= 2)
      {
        System.out.print("0");
      }

      System.out.println();
      pyramidWidth--;
      startRight += row;
    }
  }
}

