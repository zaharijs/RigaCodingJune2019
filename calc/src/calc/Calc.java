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
        //metodi, kurai padod ieksa 3 parametrus-
        // 2 int tipa skaitli
        //strings
        //ievada skaitlus, plusu vai minusu un tad izpildam darbibu
        {
        int x;
        int y;
        String calc;


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        x = input.nextInt();

        System.out.print("Please enter the second number: ");
        y = input.nextInt();

        Scanner cl = new Scanner(System.in);

        System.out.println("Please enter + or - : ");
        calc = cl.next();

        if (calc.equals("+"))
        {
            System.out.println("Your answer is: " + (x + y));
        }
        if  (calc.equals("-"))
        {
            System.out.println("Your answer is: " + (x - y));
        }
       }
    }  }  
        
        
        
   
    
     
    