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
}

