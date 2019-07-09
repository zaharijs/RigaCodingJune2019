/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

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
    
      sum(2,3);
       
    }
    private static void sum(int a, int b)
    {
        System.out.println(a+b);        
    }
    private static void example(){
      System.out.println("Hello world!"); //ar enter
        System.out.println("Hello world!2"); //bez enter
       
            
    //mainigo tipi, tie pasi, kas C#    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet tekstu!");
        String text = sc.nextLine(); // ievade konsole
        
        int number  = sc.nextInt(); //ievadam skaitli
        
        System.out.println(text); //izvade
        
        if(text.equals("vii")){
               //vai ir  vienads
        }
        if(!text.equals("vii")){
               //vai nav vienads
        }
        
        
        
        if(number == 3){
            //if piemers
        }
        else
        {
            
        }
        
    }    
    
}
