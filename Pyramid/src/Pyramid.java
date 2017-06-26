
import java.util.*;

public class Pyramid {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a width for the pyramid: ");
    int pyramidWidth = input.nextInt();

    for (int x = 1; x < pyramidWidth; x++) {
      System.out.print(" ");

      for (int y = x; y < pyramidWidth + 1; y++) {
        System.out.print(y);
      }
      System.out.println();
    }
  }
}

