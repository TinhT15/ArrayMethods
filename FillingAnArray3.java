
/**
 * Write a description of class FillingAnArray3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FillingAnArray3
{
   static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static String[] getData() {
        int number = 5;
        Scanner myScanner = new Scanner(System.in);
        String[] stringArray = {"0", "1", "2", "3", "4"};
        for (int i = 0; i < number; i++) {
                int count = i + 1;
                System.out.print("Give the value for the string in position " + count + ":  ");
                stringArray[i] = myScanner.next();
            }
            return stringArray;
    }
    
    static void printData(String[] stringArray) {
        System.out.println("Here are the values in the array.");        
        int number = 5;
        for (int i = 0; i < number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + stringArray[i] + ".");
            }
    }
    
    static boolean promptUser() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Type true if you'd like to replace one or more elements in the array.  ");
        return myScanner.nextBoolean();
    }
    
    static String[] replaceArray(String[] stringArray) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Which element number would you like to replace?  Type 1 - 5.");
        int elementNumber = myScanner.nextInt();
        System.out.print("Enter a new value for element " + elementNumber + ":  ");
        stringArray[elementNumber - 1] = myScanner.next();
        return stringArray;
    }
    
    public static void main(String[] args) {
        // Initialize Booleans to allow repetition of tasks.
        boolean playAgain = true;
        boolean fillAnElement = true;     
       
        String[] myStringArray = {"0", "1", "2", "3", "4"};

        // Initialize scanner.
        Scanner myScanner = new Scanner(System.in);
        
        // The tasks of the program that the user can repeat through the boolean playAgain.
        do {
            clearScreen();

            System.out.println("There is an array with a place for five strings.");    
            // Prompts user to input strings for the array.
            myStringArray = getData();
            
            // print out the elements in the array.                
            printData(myStringArray);
                        
            // Prompts user for choice of changing the value of an element in the array.
            fillAnElement = promptUser();
            
            // Gives the user a chance to change an element value by prompting the element number placement and the string value.
            while (fillAnElement) {
                myStringArray = replaceArray(myStringArray);
                fillAnElement = promptUser();                
            }
            
            // Prints the values in the array           
            printData(myStringArray);
            
            System.out.print("Would you like to start this process again!?  Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}
