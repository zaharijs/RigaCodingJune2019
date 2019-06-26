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
    public static void main(String[] args) {
        //metodi, kurai padod ieksa 3 parametrus-
        // 2 int tipa skaitli
        //strings
        //ievada skaitlus, plusu vai minusu un tad izpildam darbibu
        Scanner sc = new Scanner(System.in); 
        
        String txt = "x+y=";
        
        System.out.println("Please enter number x:");
        int x = sc.nextInt();
        
        System.out.println("Please enter number y:");
        int y = sc.nextInt();
    
        System.out.println(txt+(x+y));
        
                
    }
    
}
