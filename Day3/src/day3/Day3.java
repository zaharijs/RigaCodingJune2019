/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author Kārlis
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        NewClassExample example = new NewClassExample();
//        example.sample1();
        
//        NewClassExample.sample2();
        //1.Uztaisam jaunu klasi- Tasks
        //2.Klase metode, kas paprasa cilvekam ievadit skaitli
        //3.Izvada attiecigo dienu, vai ari pasaka, ka ievade nav pareiza
        //4.* try..catch parbaudam vai ievadits tiek cipars
        Task tsk = new Task();
//        tsk.displayDay();
        
        //1. Lietojam to pasu Tasks klasi
        //2. Cilveks ievada veselu skaitli
        //3. Mes sim skaitlim ar for() ciklu aprekinam faktoriali
        //4. cilveks ievada 5- 5*4*3*2*1
        //5. * try..catch
        
        tsk.factorial();
        
        //While
        //1. Uztaisam ta, lai arpus cikla 1. cilveks ievada skaitli
        //2. sakas while cikls. 2. cilveks censas uzminet skaitli
        //3. Programma darbojas tik ilgi, kamer skaitlis nav uzminets
        
        tsk.guessTheNumber();
     
    }
    
}
