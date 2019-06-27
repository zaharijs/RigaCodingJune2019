/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       loopExamples(); 
//       stars();
//       power(2,3);
//       fun1();
//       funWithParam(1, 1.2, "seit ir strings");
//       funWithParam(2,2.5, "vii!");
//       int number2 = funWithReturn();
//        System.out.println(number2);
        
        
      
      Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = input.nextInt();
        
        String star = enterNumber(x);
        
        System.out.println(star);
    }
    
    private static void loopExamples(){
      //while, for, for..each, do..while
      for(int i = 0; i<5; i++){
          System.out.println(i);
      }
        System.out.println();
        
      for(int i = 11; i>5; i--){
          System.out.println(i);
      }
      
      int number = 0;
      while(number <5){
          System.out.println(number);
          number++;
      }
        System.out.println();
      number = 0;
      do{
          System.out.println(number);
          number++;
      }while (number < 5);
 
    }
    private static void stars(){
        //*
        //**
        //***
        //****
        //for cikls un viens string
        String star = "";
        for(int i = 0; i<4; i++){
            star=star+"*";
            System.out.println(star);}
    }
     private static void power(int base, int pow){
       
       int result = 1;
       
       for(int i = 0; i<pow; i++){
           
           result = result  * base;
           System.out.println(result);
       }
   }
     private static void fun1(){
         System.out.println("Funkcija kko dara");
     }
     private static void funWithParam(int a, double b,String c){
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
     }
     
     private static int funWithReturn(){
       int c = 5+7;
       return c;
     }
     //Uztaisam metodi, kurai mes padodam lietotaja izvaditu skaitli
     // ja skaitlis ir lielaks par 5, izvadam *, ja ne, izvadam **
     //ievade/izvade  nenotiek musu metode, bet main, parbaude notiek metode
     
     private static String enterNumber(int x) {
         
         if(x > 5){
           return  "*";
             
             
         }
         else{
             
             return "**";
             
         }
         
     }
}
