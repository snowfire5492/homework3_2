
package homework3_2;
/* 
 * Chapter No. 3    Excercise No. 2
 * File Name: homeWork3.java
 * @author: Eric Schenck
 * Date: September 15, 2012
 * 
 * 
 * Problem Statement: Write a program that will read in a line of tesxt as input
 * and then output the line with the first word moved to the end of the line.
 * Assume that there is no space before the first word and that the end of the 
 * first word is indicated by a blank.
 *
 * Overall plan:
 * 1.) ask user to input a line of text
 * 2.) take the first word of text and put it on to the end of the sentence
 * 3.) drop off the first letter so i can capitolize it
 * 4.) put the letter back onto the sentence and add a question mark to the end
 * 5.) print out the rephrased sentence along with a message
 *
 */

import java.util.Scanner;

public class HomeWork3_2 {

    
    public static void main(String[] args) {
        
    
        Scanner scannerObject = new Scanner(System.in);
        
            //ask the user to input a line of text
            System.out.println("Enter a line of text. No punctuation please.");
            
        
        // set the users input to the string userInput    
        String userInput = scannerObject.nextLine();
        // single out the first word call that firstWord
        String firstWord = userInput.substring(0,4);
        // single out the rest of the sentence call that sentence
        String sentence = userInput.substring(5);
        // put the firstWord onto the end of the sentence, call newSentence
        String newSentence = (sentence + " " + firstWord + "?");
        // single out the first letter of the newSentence, call it singleOut
        String singleOut = newSentence.substring(0,1);
        //single out the rest of that sentence call it minusOne
        String minusOne = newSentence.substring(1);
        //capitalize the first letter call it capitalize
        String capitalize = singleOut.toUpperCase();
        //combine the last two to form the finalSentence
        String finalSentence = (capitalize + minusOne);
        
            //print out a message and the rephrased text
            System.out.println("I have rephrased that line to read:");
            System.out.println(finalSentence);        
    }
}
