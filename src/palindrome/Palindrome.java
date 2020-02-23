/*
 * Peter Horne-Deus
 * The tests for palindroms
 * calendarCulminating.java
 * Feburary 22, 2020
 */

package palindrome;

import javax.swing.*;

/**
 *
 * @author pehor9164
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String input,forward;
        String reverse = "";
        
        //Getting user input
        input = JOptionPane.showInputDialog("A Palinrom is a word that is the same forward and backwards. Plase enter a word ");
        
        //Setting all letters in string to lower case 
        forward = input.toLowerCase();
        
        //Setting the reverse of the string previously entered
        for (int i = input.length()-1 ; i >= 0; i--){
            reverse = reverse + input.charAt(i);
        }
        reverse = reverse.toLowerCase();
        
        //Checking if the reverse eqauals the forward and is therefore a plaindrome
        if(forward.equals(reverse)){
            JOptionPane.showMessageDialog(null, "This is a palindrom");
        }
        else{
            JOptionPane.showMessageDialog(null, "This is not a palindrom");
        }
    }
    
}
