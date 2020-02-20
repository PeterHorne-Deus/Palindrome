/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String input,forward;
        String reverse = "";
        
        input = JOptionPane.showInputDialog("A Palinrom is a word that is the same forward and backwards. Plase enter a string ");
        forward = input.toLowerCase();
        
        for (int i = input.length()-1 ; i >= 0; i--){
            reverse = reverse + input.charAt(i);
        }
        reverse = reverse.toLowerCase();
        
        if(forward.equals(reverse)){
            JOptionPane.showMessageDialog(null, "This is a palindrom");
        }
        else{
            JOptionPane.showMessageDialog(null, "This is not a palindrom");
        }
    }
    
}
