import java.util.Scanner;

public class Caesar {

  public static StringBuffer encrypt(String text, int s)
  {
    StringBuffer result = new StringBuffer();

    for (int i=0; i < text.length(); i++)
    {
      if (Character.isUpperCase(text.charAt(i)))
      {
        char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);

        result.append(ch);
      }
      else
      {
        char ch = (char)(((int)text.charAt(i) + s - 97) % 26 +97);

        result.append(ch);
      }
    }
    return result;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    String text = input.nextLine();

    int shift = (int)(Math.random() * 26);

    System.out.println("Text: " + text);
    System.out.println("Shift: " + shift);
    System.out.println("Cipher: " + encrypt(text, shift));
  }
}
