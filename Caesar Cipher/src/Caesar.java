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

        while (typeOfCipher != 1 || typeOfCipher != 2)
        {
            //Ask the user if they want to encrypt or decrypt the string
        }
    }
}