/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Kārlis
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       loopExamples(); 
       stars();
       
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
        String x = "";
        for(int i = 1; i<5; i++){
            x=x+"*";
            System.out.println(x);}
    }
   
}
