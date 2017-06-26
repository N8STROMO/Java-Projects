import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import java.util.*;

public class Caesar {
  public static void main(String args[]) {
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    //Prompt the user to enter a string to be encoded or decoded
    System.out.println("Please enter a string: ");
    //Read and store that string in userInput
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    String userInputLower = userInput.toLowerCase();

    int typeOfCipher = 0;

    // Deals with user potentially entering a wrong answer to the prompt
    while (typeOfCipher != 1 || typeOfCipher != 2) {
      // Ask the user if they want to encrypt or decrypt the string
      System.out.println("Press 1 for Encrypt and 2 for Decrypt: ");

      // TODO What if the user enters a letter or other character?

      // Encrypting
      if (typeOfCipher == 1) {
        Random randomNumber = new Random();
        int shift = randomNumber.nextInt(26);

        String encrypted = "";

        // Is this how this works?
        for (int i = 0; i < userInputLower.length(); i++) {
          char letter = userInputLower.charAt(i);

          if (letter == ' ') {
            encrypted += " ";
          }
          else {
            int curIndex = Arrays.binarySearch(alphabet, letter);
            int shiftedIndex = (curIndex + shift) % alphabet.length;
            char encrytpedChar = alphabet[shiftedIndex];
            encrypted += encrytpedChar;
          }
        }
        // Print out the ecrypted String
        System.out.println(encrypted);
        return;
      }

      // Decrypting
      else if {
        int isKeyProvided = 0;
        String decrypted = " ";

        // Deals with user potentially entering a wrong answer to the prompt
        while (isKeyProvided != 1 || isKeyProvided != 2) {
          // Ask the user if the key is provided or not
          System.out.println("Is the Key provided? Press 1 for YES and 2 for NO");

          // TODO What if the user enters a letter or other character?

          if (isKeyProvided == 1) {
            System.out.println("What is the key: ");
            int key = input.next();

            for (int i = 0; i < userInput; i++) {
              char letter = userInput.charAt(i);

              if (letter == ' ') {
                decrypted += " ";
              }
              else {
                int curIndex = Arrays.binarySearch(alphabet, letter);
                int unshiftedIndex = (curIndex - key) % 26;
                char decrytpedChar = alphabet[unshiftedIndex];
                decrypted += decrytpedChar;
              }
            }

            // Print out Decrypted
            System.out.println(decrypted);
            return;
          }
          else if (isKeyProvided == 2)
          {
            // Check every possible decryption
            for (int i = 26; i >= 0; i--)
            {
              decrypted = " ";
            }
          }
        }
      }
    }
  }