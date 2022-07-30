/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VEDANT
 */
 import java.util.Scanner;

public class Q17Program {
   

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number, // To hold the random number
            guess,  // To hold the number guessed by user
            tries = 0; // To hold number of tries
       
        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100
        
        System.out.println("Guess My Number Game");
        System.out.println();
        
        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
                
            tries++;
                
        if (guess > number)
        {
            System.out.println("Too high! Try Again");
        }
        else if (guess < number)
        {
            System.out.println("Too low! Try Again");
        }
        else
        {
	    System.out.println("Correct! You got it in " + tries + " guesses!");
        }
        
        }while (guess != number);
    }  
}

