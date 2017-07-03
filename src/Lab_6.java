/**
 * Created by chand on 6/30/2017.
 */
import java.util.Scanner;
public class Lab_6 {
    public static void main(String[] args) {
        Lab6Methods methodAccess = new Lab6Methods();
        Scanner keyboard = new Scanner(System.in);
        String yOrN = " ";
        do {
            System.out.println("Welcome to the Pig Latin Translator!");
            String prompt = "Enter a word to be translated";
            System.out.println(prompt);
            String userInput = keyboard.nextLine();


            userInput = userInput.toLowerCase().trim();

            StringBuffer result = new StringBuffer();
            String[] words = methodAccess.splitString(userInput);
            for (int i = 0; i < words.length; i++) {
                if (methodAccess.isVowels(userInput)) {
                    result.append(methodAccess.piggifiedVowels(words[i])).append(" ");
                } else {
                    result.append(methodAccess.piggifiedConsonants(words[i])).append(" ");
                }
            }
            System.out.println(result);
            System.out.println("Continue? (y/n)");
            yOrN = keyboard.nextLine();
            yOrN = methodAccess.yOrNValid(yOrN);

        } while (yOrN.equalsIgnoreCase("y"));
        if (yOrN.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }
    }
 }