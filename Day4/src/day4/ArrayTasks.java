/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class ArrayTasks {
    
    
    
    public void masivs(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ievadiet masiva garumu: ");
    
    int size = sc.nextInt();
    int[] numberArray = new int[size];
    
    double sum = 0;
    
    for(int i = 0; i<numberArray.length; i++){
        System.out.println("Ievadiet masiva" + (i+1) + ". vertibu");
         numberArray[i] = sc.nextInt();
         sum = sum+numberArray[i];
        
    }
        System.out.println("Videjais ir " + (sum/numberArray.length));
        
    }
    
    }
