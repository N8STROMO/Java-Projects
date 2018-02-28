import java.util.*;

public class Caesar
{
  public static void main(String args[])
  {
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
    while (typeOfCipher != 1 || typeOfCipher != 2)
    {
      // Ask the user if they want to encrypt or decrypt the string
      System.out.println("Press 1 for Encrypt and 2 for Decrypt: ");

      typeOfCipher = input.nextInt();
      // TODO What if the user enters a letter or other character?

      // Encrypting
      if (typeOfCipher == 1)
      {
        Random randomNumber = new Random();
        int shift = randomNumber.nextInt(26);

        String encrypted = "";

        // TODO Is this how this works?
        for (int i = 0; i < userInputLower.length(); i++)
        {
          char letter = userInputLower.charAt(i);

          // Case to deal with spaces being entered
          if (letter == ' ')
          {
            encrypted += " ";
          }
          else
          {
            int curIndex = Arrays.binarySearch(alphabet, letter);
            int shiftedIndex = (curIndex + shift) % alphabet.length;
            char encrytpedChar = alphabet[shiftedIndex];
            encrypted += encrytpedChar;
          }
        }
        // Print out the encrypted String
        System.out.println(encrypted);
        return;
      }

      // Decrypting
      else if (typeOfCipher == 2)
      {


        int isKeyProvided = 0;
        String decrypted = " ";

        // Deals with user potentially entering a wrong answer to the prompt
        while (isKeyProvided != 1 || isKeyProvided != 2)
        {
          // Ask the user if the key is provided or not
          System.out.println("Is the Key provided? Press 1 for YES and 2 for NO");

          isKeyProvided = input.nextInt();

          // TODO What if the user enters a letter or other character?

          // If the key is provided...
          if (isKeyProvided == 1)
          {
            System.out.println("What is the key: ");
            int key = input.nextInt();

            // TODO Is this how this works?
            for (int i = 0; i < userInput.length(); i++)
            {
              char letter = userInputLower.charAt(i);

              // Case to deal with spaces being entered
              if (letter == ' ')
              {
                decrypted += " ";
              }
              else
              { // Shift each individual character to the unshifted index and add it to decrypted
                int curIndex = Arrays.binarySearch(alphabet, letter);
                int unshiftedIndex = (curIndex + key) % 26;
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

              // TODO Is this how this works?
              for (int j = 0; j < userInput.length(); i++)
              {
                char letter = userInput.charAt(j);

                // Case to deal with spaces being entered
                if (letter == ' ')
                {
                  decrypted += " ";
                }
                else
                { // Shift each individual character to the unshifted index and add it to potential decrypted
                  int curIndex = Arrays.binarySearch(alphabet, letter);
                  int unshiftedIndex = (curIndex + i) % 26;
                  char decryptedChar = alphabet[unshiftedIndex];
                  decrypted += decryptedChar;
                }
              }
              // Display potential ciphers
              System.out.println(decrypted);
              return;
            }
          }
        }
      }
    }
  }
}

