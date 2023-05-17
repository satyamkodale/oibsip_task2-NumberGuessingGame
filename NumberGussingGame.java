/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satyam
 */
import java.util.Random;
import java.util.Scanner;
public class NumberGussingGame
{
    public static void main(String [] args)
    {
        Random rand = new Random();
        int cr = rand.nextInt(100);
        System.out.println(cr);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the guess number");
        int un = sc.nextInt();
    
        int counter =0;
        boolean exit = false; 
        
        int choice=1;
        
        while(choice!=0)
        {
            if(counter!=0)
            {
                System.out.println("enter the guess number");
                un=sc.nextInt();
            }
            counter++;
          choice=0;
        
        if(un==cr)
        {
            
        System.out.println("you guessed the right number");
        break;
        
        }
        else if(un>cr)
        {
            
        System.out.println("your guess is to high");
        System.out.println("need another chance then--> entr 1 for exit--> enter 0");
        choice = sc.nextInt();
        
        }
        else if(un<cr)
        {
            
            System.out.println("your guess is too low");
            System.out.println("need another chance then--> entr 1 for exit--> enter 0");
           choice = sc.nextInt();
        
        }
       
        
        
        }
        
        System.out.println("total attempts are "+counter);
    
    }
    
}
