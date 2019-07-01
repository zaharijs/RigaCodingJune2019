/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Task {
    
    public void displayDay(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadiet dienu!");
        int day;
        try{
        
            day = sc.nextInt();

            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }catch(Exception ex){
            System.out.println("Error2!");
        }
    }
    public void factorial(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadiet skaitli!");
        int number;
        try{
        
            number = sc.nextInt();
            int  result = 1;
            
            for(int i = 1; i<=number; i++){
                result = result*i;
            }
            System.out.println("Rezultats ir " + result);
        }catch(Exception ex){
            System.out.println("Jaievada skaitlis!");
        }
        
        
        
}
    public void guessTheNumber(){
        System.out.println("Ievadiet skaitli!");
        Scanner sc = new Scanner(System.in);
        
        int numberToGuess = sc.nextInt();
        int number;
        
        do{
            System.out.println("Ievadiet skaitli!");
            number = sc.nextInt();
            if(number!=numberToGuess){
                System.out.println("Neuzminejat, meginiet vel!");
            }
        }while(numberToGuess!=number);
        
        System.out.println("Veiksmigi uzminejat!");
    }            
}

