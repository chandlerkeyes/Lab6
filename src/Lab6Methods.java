import java.util.Scanner;

/**
 * Created by chand on 7/3/2017.
 */
public class Lab6Methods {
    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }
    public static String[] splitString(String userInput) {
        String[] line1 = userInput.split(" ");
        return line1;
    }


    public static String piggifiedConsonants(String userInput) {
        String vowels = "aeiou";
        String result = "";
        String regex = "[0-9]+";
        int end = 0; //last character before the vowel
        //while the character last character before the vowel is less than length
        //and while there's no vowel in this character
        if (!userInput.matches(regex)) {
            while ((end < userInput.length()) && !(vowels.contains("" + userInput.charAt(end)))) {
                String beforVowel = ""; // String of characters before vowel
                beforVowel = beforVowel + userInput.charAt(end); // collects the letters before vowel
                end++;
                result = userInput.substring(end) + beforVowel + "ay";
            }
        } else {
            result = userInput;
        }
        return result;
    }


    //Translates a word using vowel pig latin logic
    public static String piggifiedVowels(String userInput) {
        userInput = userInput + "way";
        return userInput;
    }

    //Determines if a word starts with a vowel consonant
    public static boolean isVowels(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' ||
                userInput.charAt(0) == 'o' || userInput.charAt(0) == 'i' || userInput.charAt(0) == 'u') {

            return true;
        }
        return false;
    }

    public static String continueLoop(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!keyboard.hasNext())
            if ((yOrN.equalsIgnoreCase("Y") || (yOrN.equalsIgnoreCase("N")))) {
                System.out.println("Please enter Y or N:");
                yOrN = keyboard.nextLine();
            } else {
                yOrN = yOrN;
            }
        return yOrN;
    }
}

