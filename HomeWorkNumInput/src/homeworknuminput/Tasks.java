/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworknuminput;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Tasks {
    
    public void enterNum(){
    Scanner sc = new Scanner(System.in);
    
    
        System.out.println("Enter number: ");
        int number;
        
        number = sc.nextInt();
        do{
        System.out.println("Enter more y/n?");
        char input;
        
        input = sc.next();
            if(input == y){
                
            }while(input == n)
        }
        
    }
    
}
