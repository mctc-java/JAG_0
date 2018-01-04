package week_0;

import static input.InputUtils.stringInput;

/**
 * Write a method that creates a String from three exact copies of itself.
 *
 * So if the method is given the string "cat", it will return "catcatcat".
 */

public class Question_4_Triplicate_String {
    
    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        String input = stringInput("Enter your String to print in triplicate: ");
        String output = triplicate(input);
    
        System.out.println("Your String three times is: ");
        System.out.println(output);
        
        
    }
    
    public static String triplicate(String userString) {
        
        // TODO return a String that is three copies of the original String.
        // Example: if userString = "Java" this method should return "JavaJavaJava".
        return null;
    }
    
}
