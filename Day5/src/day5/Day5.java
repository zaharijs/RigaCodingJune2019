/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author Kārlis
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        exampleHumans();
        Human hm = new Human();
        hm.dateBorn();
       
    }
    
    public static void examples1(){
        Example ex = new Example();
        ex.setField1(4);
        int randomVariable = ex.getField1();
//        ex.sample2();
//        ex.sample1();
//        ex.sample2();
        
//        ex.field1 = 12;
//        System.out.println(ex.field1);
//        
//        Example ex2 = new Example();
//        ex2.field1 = 13;
//        System.out.println(ex.field1);
    }
    
    private static void exampleHumans(){
        
        Human peteris = new Human();
        
        peteris.setAge(-1);
        peteris.setName("Peteris");
        peteris.setSurname("Ozolins");
        
        
        
    }
  
}

