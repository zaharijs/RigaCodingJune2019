/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Human {
    
    private String name = "";
    private String surname = "";
    private int age = 25;
    
    public void setName(String name){
        if(this.name == ""){
            System.out.println("Ievadiet vardu!");
        }
        
        this.name = name;
        
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setAge(int age){
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }
    
    public String getName(){
        if(this.name.equals("")){
            System.out.println("Ievadiet vardu!");
            Scanner sc = new Scanner(System.in);
            this.name = sc.next();
        }
        return name;
    }
    
    public String getSurname(){
        if(this.name.equals("")){
            return "NavDatu!!";
        }
        return surname;
    }
        
    
    public int getAge(){
        return age;
    }
   public void dateBorn(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter current date");
       
       int date = sc.nextInt();
       System.out.println(date - this.age);
   }
   
}
