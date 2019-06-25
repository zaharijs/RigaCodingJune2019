/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayone;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class DayOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Hello world!"); //ar enter
        System.out.println("Hello world!2"); //bez enter
       
            
    //mainigo tipi, tie pasi, kas C#    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet tekstu!");
        String text = sc.nextLine();
        
        System.out.println(text);
        
        
        
    }
    
}
