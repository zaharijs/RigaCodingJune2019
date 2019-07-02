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

    public void enterNum() {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        
        
        int number;
        
        do {

            System.out.println("Enter number: ");
            number = sc.nextInt();
            
            System.out.println("Enter more y/n?");
            
            if(input.equals("n")){
                
            
            }
            
        }while(input.equals("y"));
        
    
           
        }
    
    }
