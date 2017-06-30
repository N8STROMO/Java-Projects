import java.util.*;

public class Pyramid {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a width for the pyramid: ");
    int pyramidWidth = input.nextInt();

    for (int x = pyramidWidth; x > 0; x--) {
      System.out.print(" ");

      for (int i = x; i < pyramidWidth + 1; i++) {
        System.out.print(" 1 ");
      }

      System.out.println();
    }
  }
}

