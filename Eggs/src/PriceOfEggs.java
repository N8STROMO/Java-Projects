import java.util.Scanner;
public class PriceOfEggs
{
  public static void main(String[] args)
  {
    int numEggs;
    int numDozs;
    Double pricePerDozen = 3.25;
    Double pricePerInd = .45;
    Double total = 0.0;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the number of eggs: ");

    numEggs = input.nextInt();

    numDozs = CalNumDozs(numEggs);

    total += (numDozs * pricePerDozen);
    total += ((numEggs - (numDozs * 12)) * pricePerInd);

    System.out.println("You total is " + total);
  }

  public static int CalNumDozs(int eggs)
  {
    int singles = eggs % 12;
    return (eggs - singles) / 12;
  }
}
