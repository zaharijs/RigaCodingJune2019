/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;


/**
 *
 * @author Marti
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        sum(2,3);
        //metodi, kurai padod ieksa 3 parametrus-
        // 2 int tipa skaitli
        //strings
        //ievada skaitlus, plusu vai minusu un tad izpildam darbibu
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadit pirmo skaitli!");
        int number = sc.nextInt();
        
        System.out.println("Ievadiet otro skaitli!");
        int numberTwo = sc.nextInt();
        
        System.out.println("Ievadiet + vai -");
        String choice = sc.next();
        
        sumOrSubtract(number, numberTwo, choice);
    }
    
    private static void sum(int a, int b){
        System.out.println(a+b);
    } 
    
    private static void example(){
        System.out.println("Hello world!"); //ar enter
        System.out.print("Hello world!2"); //bez enter
        
        //mainigo tipi, tie pasi, kas C#
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ievadiet tekstu!");
        String text = sc.nextLine(); //ievade konsole
        
        System.out.println("Ievadiet skaitli!");
        
        int number = sc.nextInt(); //ievadam skaitli
        
        System.out.println(text); //izvade
        
        if(text.equals("vii")){
            //vai ir vienads
        }
        
        if(!text.equals("vii")){
            //vai nav vienads
        }
        
        if(number == 3){
            //if piemers
        }else{
            
        }    
    }
    
    private static void sumOrSubtract(int number1, int number2, String choice){
        
        if(choice.equals("+")){
            System.out.println("Rezultats ir " + (number1+number2));
        }else if(choice.equals("-")){
            System.out.println("Rezultats ir " + (number1-number2));
        }else{
            System.out.println("Nav pareizi ievadits simbols");
        }
        
    }
    
}
