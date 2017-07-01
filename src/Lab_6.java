/**
 * Created by chand on 6/30/2017.
 */
import java.util.Scanner;
public class Lab_6 {
     public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         String yOrN = " ";
         do { //1. Display a welcome message!
             System.out.println("Welcome to the Pig Latin Translator!");
             //2. Prompt the user the enter a line
             String prompt = "Enter a word to be translated";
             //3. Get user input
             System.out.println(prompt);
             String userInput = keyboard.nextLine();


             //4. Translate user input
             //4.1 Make the user input lowercase
             userInput = userInput.toLowerCase().trim();

             String result;
             if (isVowels(userInput)) {
                 result = piggifiedVowels(userInput);
             } else {
                 result = piggifiedConsonants(userInput);
             }
             //5. Display result
             System.out.println(result);
             //6. Prompt user to continue (y/n)?
             System.out.println("Continue? (y/n)");
             yOrN = keyboard.nextLine();
         } while (yOrN.equalsIgnoreCase("y"));
         if (yOrN.equalsIgnoreCase("n")) {
             System.out.println("Bye");
         }
     }

    private static String piggifiedConsonants(String userInput) {
        String vowels = "aeiou";
        String result = "";
        int end = 0; //last character before the vowel
        //while the character last character before the vowel is less than length
        //and while there's no vowel in this character
        while ((end < userInput.length()) && !(vowels.contains("" + userInput.charAt(end))))
        {
            String beforVowel = ""; // String of characters before vowel
            beforVowel = beforVowel + userInput.charAt(end); // collects the letters before vowel
            end++;
            result = userInput.substring(end) + beforVowel + "ay";
        }
        return result;
    }


    //Translates a word using vowel pig latin logic
    private static String piggifiedVowels(String userInput) {
        userInput = userInput + "way";
        return userInput;
    }
    //Determines if a word starts with a vowel consonant
    private static boolean isVowels(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' ||
                userInput.charAt(0) == 'o' || userInput.charAt(0) == 'i' || userInput.charAt(0) == 'u' ) {

            return true;
        }
        return false;
    }
    private static String continueLoop(String yOrN){
         Scanner keyboard = new Scanner(System.in);
         while(!keyboard.hasNext())
         if ((yOrN.equalsIgnoreCase("Y") || (yOrN.equalsIgnoreCase("N")))) {
             System.out.println("Please enter Y or N:");
             yOrN = keyboard.nextLine();
         }
         else {
             yOrN = yOrN;
         }
         return yOrN;
    }

  /*  private static String inputValid(String userInput) {
        Scanner keyboard = new Scanner(System.in);

        while(keyboard.hasNextInt()) {
            if (keyboard.hasNextInt()) {
                System.out.println("Must enter a word:");
                String newUserInput = keyboard.nextLine();
                userInput = newUserInput;
            } else {
                userInput = userInput ;
            }
        }
        try {
            userInput = keyboard.nextLine();
        }

        catch (StringIndexOutOfBoundsException a) {
            System.out.print("Must enter a word:");
        }
        return userInput;
    } */
}


