/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author Marti
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Uzdevums
        //1. Uztaisit klasi ar nosaukumu Triangle
        //2. metodes get, set, katrai no trijstura malam
        //3. metode, lai var dabut perimetru.
        // * parbaudi taisam ta lai prasa ievadit kamer nav pareizi while
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
        
        peteris.setAge(67);
        peteris.setName("peteris");
        peteris.setSurname("Ozolins");
        peteris.printYearOfBirth();
        
        System.out.println(peteris.getName() + " " + peteris.getSurname());
    }
    
}
