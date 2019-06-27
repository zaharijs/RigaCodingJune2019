/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x;
        int y;
        String calc;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        x = input.nextInt();
        
        Scanner cl = new Scanner(System.in);
        System.out.print("Please enter + or - : ");
        calc = cl.next();

        System.out.print("Please enter the second number: ");
        y = input.nextInt();
               
        if (calc.equals("+"))
        {
            System.out.println("Your answer is: " + (x + y));
        }
        else if  (calc.equals("-"))
        {
            System.out.println("Your answer is: " + (x - y));
        }
    } 
}   
        
        
        
   
    
     
    