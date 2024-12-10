/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namemanipulator;
import java.util.Scanner;


public class NAMEMANIPULATOR {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        
        if (InputUtilities.isTextOnly(name)) {
            
            String upperCaseName = name.toUpperCase();

            
            String reversedName = new StringBuilder(name).reverse().toString();

            
            String rearrangedName = name.charAt(name.length() - 1) + name.substring(0, name.length() - 1);

            
            System.out.println("Original Name: " + name);
            System.out.println("Uppercase Name: " + upperCaseName);
            System.out.println("Reversed Name: " + reversedName);
            System.out.println("Rearranged Name: " + rearrangedName);
        } else {
           
            System.out.println("Invalid input! Please enter text only with no numbers.");
        }

       
        scanner.close();
    }
}


class InputUtilities {
    
    public static boolean isTextOnly(String input) {
        
        return input.matches("[a-zA-Z]+");
    }
}
